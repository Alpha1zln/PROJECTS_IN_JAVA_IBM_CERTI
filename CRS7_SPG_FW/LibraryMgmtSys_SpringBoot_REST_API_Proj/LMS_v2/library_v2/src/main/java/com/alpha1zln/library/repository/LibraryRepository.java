

package com.alpha1zln.library.repository;

import com.alpha1zln.library.model.*;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LibraryRepository {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<BorrowingRecord> records = new ArrayList<>();

    private long bookIdCounter = 1;
    private long memberIdCounter = 1;
    private long recordIdCounter = 1;

    // ===== BOOK ==========================
    public Book saveBook(Book book) {
        book.setId(bookIdCounter++);
        books.add(book);
        return book;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Optional<Book> findBookById(Long id) {
        return books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
    }

    public List<Book> findBookByName(String name) {
        return books.stream()
                .filter(b -> b.getTitle().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    public Book updateBook(Long id, Book updatedBook) {
    for (int i = 0; i < books.size(); i++) {
        Book b = books.get(i);

        if (b.getId().equals(id)) {
            updatedBook.setId(id);
            books.set(i, updatedBook);
            return updatedBook;
        }
    }
    return null; // not found
}

    public void deleteBook(Book book) {
        books.remove(book);
    }

    // ===== MEMBER ================================
    public Member saveMember(Member member) {
        member.setId(memberIdCounter++);
        members.add(member);
        return member;
    }

    public Optional<Member> findMemberById(Long id) {
        return members.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst();
    }

    public List<Member> findMemberByName(String name) {
        return members.stream()
                .filter(m -> m.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }

    public List<Member> getAllMembers() {
        return members;
    }

    public Member updateMember(Long id, Member updatedMember) {
        for (int i = 0; i < members.size(); i++) {
            Member m = members.get(i);

            if (m.getId().equals(id)) {
                updatedMember.setId(id);
                members.set(i, updatedMember);
                return updatedMember;
            }
        }
        return null; // not found
    }

    // ✅ ADD THIS (missing earlier)
    public void deleteMember(Member member) {
        members.remove(member);
    }

    // ===== Borrow ,  RECORD ===============================================
    public BorrowingRecord saveRecord(BorrowingRecord record) {
        record.setId(recordIdCounter++);
        records.add(record);
        return record;
    }

    public Optional<BorrowingRecord> findRecordById(Long id) {
        return records.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst();
    }

    public List<BorrowingRecord> getAllRecords() {
        return records;
    }
}


// *******************************************************
// package com.alpha1zln.library.repository;

// import com.alpha1zln.library.model.*;
// import org.springframework.stereotype.Repository;

// import java.util.*;

// @Repository
// public class LibraryRepository {

//     private List<Book> books = new ArrayList<>();
//     private List<Member> members = new ArrayList<>();
//     private List<BorrowingRecord> records = new ArrayList<>();

//     private long bookIdCounter = 1;
//     private long memberIdCounter = 1;
//     private long recordIdCounter = 1;

//     // ===== BOOK ==========================
//     public Book saveBook(Book book) {
//         book.setId(bookIdCounter++);
//         books.add(book);
//         return book;
//     }

//     public List<Book> getAllBooks() {
//         return books;
//     }

//     public Optional<Book> findBookById(Long id) {
//         return books.stream()
//                 .filter(b -> b.getId().equals(id))
//                 .findFirst();
//     }

//     public List<Book> findBookByName(String name) {
//         return books.stream()
//                 .filter(b -> b.getTitle().toLowerCase().contains(name.toLowerCase()))
//                 .toList();
//     }

//     public void deleteBook(Book book) {
//         books.remove(book);
//     }

//     // ===== MEMBER ================================
//     public Member saveMember(Member member) {
//         member.setId(memberIdCounter++);
//         members.add(member);
//         return member;
//     }

//     public Optional<Member> findMemberById(Long id) {
//         return members.stream()
//                 .filter(m -> m.getId().equals(id))
//                 .findFirst();
//     }

//     public List<Member> findMemberByName(String name) {
//         return members.stream()
//                 .filter(m -> m.getName().toLowerCase().contains(name.toLowerCase()))
//                 .toList();
//     }

//     public List<Member> getAllMembers() {
//         return members;
//     }

//     // ===== RECORD ===============================================
//     public BorrowingRecord saveRecord(BorrowingRecord record) {
//         record.setId(recordIdCounter++);
//         records.add(record);
//         return record;
//     }

//     public Optional<BorrowingRecord> findRecordById(Long id) {
//         return records.stream()
//                 .filter(r -> r.getId().equals(id))
//                 .findFirst();
//     }

//     public List<BorrowingRecord> getAllRecords() {
//         return records;
//     }
// }