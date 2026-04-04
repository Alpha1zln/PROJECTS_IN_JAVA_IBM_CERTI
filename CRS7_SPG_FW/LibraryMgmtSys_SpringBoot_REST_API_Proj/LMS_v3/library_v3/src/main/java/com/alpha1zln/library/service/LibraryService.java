package com.alpha1zln.library.service;

import com.alpha1zln.library.model.*;
import com.alpha1zln.library.repository.LibraryRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    private static final Logger logger = LoggerFactory.getLogger(LibraryService.class);

    @Autowired
    private LibraryRepository repo;
  


    // ==================== BOOK ====================

    public Book addBook(Book book) {
        Book saved = repo.saveBook(book);
        logger.info("Book added: " + saved);
        return saved;
    }

    public List<Book> getAllBooks() {
        return repo.getAllBooks();
    }

    public Book getBookById(Long id) {
        Optional<Book> optional = repo.findBookById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            logger.warn("Book not found with id: " + id);
            return null;
        }
    }

    public List<Book> searchBookByName(String name) {
        List<Book> books = repo.findBookByName(name);

        if (books.isEmpty()) {
            logger.warn("No books found with name: " + name);
        }

        return books;
    }



    public Book updateBook(Long id, Book updatedBook) {
        Book result = repo.updateBook(id, updatedBook);

        if (result == null) {
            logger.warn("Book not found for update: " + id);
        } else {
            logger.info("Book updated: " + result);
        }

        return result;
    }

    public boolean deleteBook(Long id) {
        Optional<Book> optional = repo.findBookById(id);

        if (optional.isEmpty()) {
            logger.warn("Delete failed. Book not found: " + id);
            return false;
        }

        repo.deleteBook(optional.get());
        logger.info("Book deleted with id: " + id);
        return true;
    }

    // Feature 1: list of stds who borrowed a specific book
    // using book name
    public List<String> getMembersByBookName(String bookName) {
        List<String> result = new ArrayList<>();

        for (BorrowingRecord record : repo.getAllRecords()) {
            if (record.getBook().getTitle().equalsIgnoreCase(bookName)) {
                result.add(record.getMember().getName());
            }
        }

        return result;
    }

    // using book id
    public List<String> getMembersByBookId(Long bookId) {
        List<String> result = new ArrayList<>();

        for (BorrowingRecord record : repo.getAllRecords()) {
            if (record.getBook().getId().equals(bookId)) {
                result.add(record.getMember().getName());
            }
        }

        return result;
    }

    // Feature 2: Books borrowed by a member
    // using member name 
    public List<String> getBooksByMemberName(String memberName) {
        List<String> result = new ArrayList<>();

        for (BorrowingRecord record : repo.getAllRecords()) {
            if (record.getMember().getName().equalsIgnoreCase(memberName)) {
                result.add(record.getBook().getTitle());
            }
        }
        return result;
    }

    // using member id 
    public List<String> getBooksByMemberId(Long memberId) {
        List<String> result = new ArrayList<>();

        for (BorrowingRecord record : repo.getAllRecords()) {
            if (record.getMember().getId().equals(memberId)) {
                result.add(record.getBook().getTitle());
            }
        }
        return result;
    }

    
    // ==================== MEMBER ====================

    public Member addMember(Member member) {
        Member saved = repo.saveMember(member);
        logger.info("Member added: " + saved);
        return saved;
    }

    public List<Member> getAllMembers() {
        return repo.getAllMembers();
    }

    public Member getMemberById(Long id) {
        Optional<Member> optional = repo.findMemberById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            logger.warn("Member not found with id: " + id);
            return null;
        }
    }

    public List<Member> searchMemberByName(String name) {
        List<Member> members = repo.findMemberByName(name);

        if (members.isEmpty()) {
            logger.warn("No members found with name: " + name);
        }

        return members;
    }

    public Member updateMember(Long id, Member updatedMember) {
        Member result = repo.updateMember(id, updatedMember);

        if (result == null) {
            logger.warn("Member not found for update: " + id);
        } else {
            logger.info("Member updated: " + result);
        }

        return result;
    }

    public boolean deleteMember(Long id) {
        Optional<Member> optional = repo.findMemberById(id);

        if (optional.isEmpty()) {
            logger.warn("Delete failed. Member not found: " + id);
            return false;
        }

        repo.getAllMembers().remove(optional.get());
        logger.info("Member deleted with id: " + id);
        return true;
    }

    // ==================== BORROW ====================

    // borrow a book ..  dec its copies ... add it in records
    public BorrowingRecord borrowBook(Long bookId, Long memberId) {

        Optional<Book> bookOpt = repo.findBookById(bookId);
        Optional<Member> memberOpt = repo.findMemberById(memberId);
        if (bookOpt.isEmpty() || memberOpt.isEmpty()) {
            logger.warn("Borrow failed: Book or Member not found");
            return null;
        }

        Book book = bookOpt.get();
        Member member = memberOpt.get();

        if (book.getAvailableCopies() <= 0) {
            logger.warn("No copies available for book: " + book.getTitle());
            return null;
        }

        BorrowingRecord record = new BorrowingRecord();
        record.setBook(book);
        record.setMember(member);
        record.setBorrowDate(LocalDate.now());
        record.setDueDate(LocalDate.now().plusDays(14));

        repo.saveRecord(record);
        book.setAvailableCopies(book.getAvailableCopies() - 1);

        logger.info("Book borrowed: " + record);
        return record;
    }

    // return a book ... inc its copies ... Rmv it from records
    public String returnBook(Long recordId) {

        Optional<BorrowingRecord> optional = repo.findRecordById(recordId);
        if (optional.isEmpty()) {
            logger.warn("Return failed. Record not found: " + recordId);
            return "Record not found";
        }

        BorrowingRecord record = optional.get();
        Book book = record.getBook();

        // increase copies
        book.setAvailableCopies(book.getAvailableCopies() + 1);

        // 🔥 remove record from list
        repo.getAllRecords().remove(record);
        logger.info("Book returned and record removed: " + recordId);

        return "Book returned successfully";
    }


    // get all records 
    public List<BorrowingRecord> getAllRecords() {
        return repo.getAllRecords();
    }



}


// ****************************************************
// package com.alpha1zln.library.service;

// import com.alpha1zln.library.model.*;
// import com.alpha1zln.library.repository.LibraryRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.time.LocalDate;
// import java.util.List;

// @Service
// public class LibraryService {

//     @Autowired
//     private LibraryRepository repo;

//     // ===== BOOK ======================

//     public Book addBook(Book book) {
//         return repo.saveBook(book);
//     }

//     public List<Book> getAllBooks() {
//         return repo.getAllBooks();
//     }

//     public Book getBookById(Long id) {
//         return repo.findBookById(id)
//                 .orElseThrow(() -> new RuntimeException("Book not found"));
//     }

//     public List<Book> searchBookByName(String name) {
//         return repo.findBookByName(name);
//     }

//     // ===== MEMBER =====

//     public Member addMember(Member member) {
//         return repo.saveMember(member);
//     }

//     public Member getMemberById(Long id) {
//         return repo.findMemberById(id)
//                 .orElseThrow(() -> new RuntimeException("Member not found"));
//     }

//     public List<Member> searchMemberByName(String name) {
//         return repo.findMemberByName(name);
//     }

//     public List<Member> getAllMembers() {
//         return repo.getAllMembers();
//     }

//     // ===== BORROW =====

//     public BorrowingRecord borrowBook(Long bookId, Long memberId) {

//         Book book = getBookById(bookId);
//         Member member = getMemberById(memberId);

//         if (book.getAvailableCopies() <= 0) {
//             throw new RuntimeException("No copies available");
//         }

//         BorrowingRecord record = new BorrowingRecord();
//         record.setBook(book);
//         record.setMember(member);
//         record.setBorrowDate(LocalDate.now());
//         record.setDueDate(LocalDate.now().plusDays(14));

//         repo.saveRecord(record);

//         // decrease copies
//         book.setAvailableCopies(book.getAvailableCopies() - 1);

//         return record;
//     }

//     public String returnBook(Long recordId) {

//         BorrowingRecord record = repo.findRecordById(recordId)
//                 .orElseThrow(() -> new RuntimeException("Record not found"));

//         if (record.getReturnDate() != null) {
//             return "Already returned";
//         }

//         record.setReturnDate(LocalDate.now());

//         Book book = record.getBook();
//         book.setAvailableCopies(book.getAvailableCopies() + 1);

//         return "Book returned successfully";
//     }

//     public List<BorrowingRecord> getAllRecords() {
//         return repo.getAllRecords();
//     }
// }