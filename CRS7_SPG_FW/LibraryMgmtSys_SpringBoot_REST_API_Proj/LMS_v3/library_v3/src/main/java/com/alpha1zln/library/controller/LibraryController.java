package com.alpha1zln.library.controller;

import com.alpha1zln.library.model.*;
import com.alpha1zln.library.service.LibraryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibraryController {

    private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

    @Autowired
    private LibraryService libraryService;

    // ==================== BOOK ====================

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        Book saved = libraryService.addBook(book);
        logger.info("Book added: " + saved);
        return saved;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        logger.info("All books fetched");
        return libraryService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Object getBookById(@PathVariable Long id) {
        Book book = libraryService.getBookById(id);

        if (book == null) return "Book not found";

        return book;
    }

    @GetMapping("/books/search")
    public Object searchBooks(@RequestParam String name) {
        List<Book> books = libraryService.searchBookByName(name);

        if (books.isEmpty()) return "No books found";

        return books;
    }

    // ✅ UPDATE BOOK
    @PutMapping("/books/{id}")
    public Object updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book updated = libraryService.updateBook(id, book);

        if (updated == null) return "Book not found";

        return updated;
    }

    // ✅ DELETE BOOK
    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id) {
        boolean deleted = libraryService.deleteBook(id);

        if (!deleted) return "Book not found";

        return "Book deleted successfully";
    }

    // ftr 1 : list of stds who borrowed a specific book 
        // using book name
    @GetMapping("/books/name/{name}/members")
    public Object getMembersByBookNameCtr(@PathVariable String name) {
        List<String> members = libraryService.getMembersByBookName(name);

        if (members.isEmpty()) return "No one borrowed this book";

        return members;
    }

        // using bookId
    @GetMapping("/books/id/{bookId}/members")
    // PathVariable name MUST match URL variable - vip
    public Object getMembersByBookIdCtr(@PathVariable Long bookId) {
        List<String> members = libraryService.getMembersByBookId(bookId);

        if (members.isEmpty()) return "No one borrowed this book";

        return members;
    }


    // ftr 2 : list of books issued to a prtr std.
        // using std name
    @GetMapping("/members/name/{name}/books")
    public Object getBooksByMemberNameCtr(@PathVariable String name) {

        List<String> books = libraryService.getBooksByMemberName(name);

        if (books.isEmpty()) return "No books issued";

        return books;
    }

        // using std Id
    @GetMapping("/members/id/{id}/books")
    public Object getBooksByMemberIdCtr(@PathVariable Long id) {

        List<String> books = libraryService.getBooksByMemberId(id);

        if (books.isEmpty()) return "No books issued";

        return books;
    }

    // ==================== MEMBER ====================

    @PostMapping("/members")
    public Member addMember(@RequestBody Member member) {
        Member saved = libraryService.addMember(member);
        logger.info("Member added: " + saved);
        return saved;
    }

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return libraryService.getAllMembers();
    }

    @GetMapping("/members/{id}")
    public Object getMemberById(@PathVariable Long id) {
        Member member = libraryService.getMemberById(id);

        if (member == null) return "Member not found";

        return member;
    }

    @GetMapping("/members/search")
    public Object searchMembers(@RequestParam String name) {
        List<Member> members = libraryService.searchMemberByName(name);

        if (members.isEmpty()) return "No members found";

        return members;
    }

    // ✅ UPDATE MEMBER
    @PutMapping("/members/{id}")
    public Object updateMember(@PathVariable Long id, @RequestBody Member member) {
        Member updated = libraryService.updateMember(id, member);

        if (updated == null) return "Member not found";

        return updated;
    }

    // ✅ DELETE MEMBER
    @DeleteMapping("/members/{id}")
    public String deleteMember(@PathVariable Long id) {
        boolean deleted = libraryService.deleteMember(id);

        if (!deleted) return "Member not found";

        return "Member deleted successfully";
    }

    // ==================== BORROW ====================

    @PostMapping("/borrow")
    public Object borrowBook(@RequestParam Long bookId,
                             @RequestParam Long memberId) {

        BorrowingRecord record = libraryService.borrowBook(bookId, memberId);

        if (record == null) return "Borrow failed";

        return record;
    }

    @PutMapping("/return/{recordId}")
    public String returnBook(@PathVariable Long recordId) {
        return libraryService.returnBook(recordId);
    }

    // ==================== RECORD ====================

    @GetMapping("/records")
    public List<BorrowingRecord> getAllRecords() {
        return libraryService.getAllRecords();
    }
}

// // ***********************************************
// package com.alpha1zln.library.controller;

// import com.alpha1zln.library.model.Book;
// import com.alpha1zln.library.model.Member;
// import com.alpha1zln.library.model.BorrowingRecord;
// import com.alpha1zln.library.service.LibraryService;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api")
// public class LibraryController {

//     private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

//     @Autowired
//     private LibraryService libraryService;

//     // ==================== BOOK ====================

//     @PostMapping("/books")
//     public Book addBook(@RequestBody Book book) {
//         Book saved = libraryService.addBook(book);
//         logger.info("Book added: " + saved);
//         return saved;
//     }

//     @GetMapping("/books")
//     public List<Book> getAllBooks() {
//         List<Book> books = libraryService.getAllBooks();
//         logger.info("All books fetched");
//         return books;
//     }

//     @GetMapping("/books/{id}")
//     public Book getBookById(@PathVariable Long id) {
//         Book book = libraryService.getBookById(id);
//         logger.info("Book fetched with id: " + id);
//         return book;
//     }

//     // 🔥 Search by name (IMPORTANT)
//     @GetMapping("/books/search")
//     public List<Book> searchBooks(@RequestParam String name) {
//         logger.info("Searching books with name: " + name);
//         return libraryService.searchBookByName(name);
//     }

//     // ==================== MEMBER ====================

//     @PostMapping("/members")
//     public Member addMember(@RequestBody Member member) {
//         Member saved = libraryService.addMember(member);
//         logger.info("Member added: " + saved);
//         return saved;
//     }

//     @GetMapping("/members")
//     public List<Member> getAllMembers() {
//         logger.info("Fetching all members");
//         return libraryService.getAllMembers();
//     }

//     @GetMapping("/members/{id}")
//     public Member getMemberById(@PathVariable Long id) {
//         logger.info("Fetching member with id: " + id);
//         return libraryService.getMemberById(id);
//     }

//     // 🔥 Search by name
//     @GetMapping("/members/search")
//     public List<Member> searchMembers(@RequestParam String name) {
//         logger.info("Searching members with name: " + name);
//         return libraryService.searchMemberByName(name);
//     }

//     // ==================== BORROW ====================

//     // 🔥 Practical borrow (using IDs)
//     @PostMapping("/borrow")
//     public BorrowingRecord borrowBook(
//             @RequestParam Long bookId,
//             @RequestParam Long memberId) {

//         BorrowingRecord record = libraryService.borrowBook(bookId, memberId);
//         logger.info("Book borrowed. BookId: " + bookId + ", MemberId: " + memberId);

//         return record;
//     }

//     // 🔥 Return book
//     @PutMapping("/return/{recordId}")
//     public String returnBook(@PathVariable Long recordId) {
//         logger.info("Returning book with recordId: " + recordId);
//         return libraryService.returnBook(recordId);
//     }

//     // ==================== RECORD ====================

//     @GetMapping("/records")
//     public List<BorrowingRecord> getAllRecords() {
//         logger.info("Fetching all borrowing records");
//         return libraryService.getAllRecords();
//     }
// }





/// ****************************************************

// package com.alpha1zln.library.controller;

// import com.alpha1zln.library.model.*;
// import com.alpha1zln.library.service.LibraryService;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api")
// public class LibraryController {

//     private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

//     @Autowired
//     private LibraryService libraryService;

//     // ==================== BOOK ====================

//     @PostMapping("/books")
//     public Book addBook(@RequestBody Book book) {
//         return libraryService.addBook(book);
//     }

//     @GetMapping("/books")
//     public List<Book> getAllBooks() {
//         return libraryService.getAllBooks();
//     }

//     @GetMapping("/books/{id}")
//     public Object getBookById(@PathVariable Long id) {
//         Book book = libraryService.getBookById(id);

//         if (book == null) {
//             return "Book not found";
//         }
//         return book;
//     }

//     @GetMapping("/books/search")
//     public Object searchBooks(@RequestParam String name) {
//         List<Book> books = libraryService.searchBookByName(name);

//         if (books.isEmpty()) {
//             return "No books found";
//         }
//         return books;
//     }

//     // 🔥 UPDATE BOOK
//     @PutMapping("/books/{id}")
//     public Object updateBook(@PathVariable Long id, @RequestBody Book book) {
//         Book updated = libraryService.updateBook(id, book);

//         if (updated == null) {
//             return "Book not found";
//         }
//         return updated;
//     }

//     // 🔥 DELETE BOOK
//     @DeleteMapping("/books/{id}")
//     public String deleteBook(@PathVariable Long id) {
//         boolean deleted = libraryService.deleteBook(id);

//         if (!deleted) {
//             return "Book not found";
//         }
//         return "Book deleted successfully";
//     }

//     // ==================== MEMBER ====================

//     @PostMapping("/members")
//     public Member addMember(@RequestBody Member member) {
//         return libraryService.addMember(member);
//     }

//     @GetMapping("/members")
//     public List<Member> getAllMembers() {
//         return libraryService.getAllMembers();
//     }

//     @GetMapping("/members/{id}")
//     public Object getMemberById(@PathVariable Long id) {
//         Member member = libraryService.getMemberById(id);

//         if (member == null) {
//             return "Member not found";
//         }
//         return member;
//     }

//     @GetMapping("/members/search")
//     public Object searchMembers(@RequestParam String name) {
//         List<Member> members = libraryService.searchMemberByName(name);

//         if (members.isEmpty()) {
//             return "No members found";
//         }
//         return members;
//     }

//     // 🔥 UPDATE MEMBER
//     @PutMapping("/members/{id}")
//     public Object updateMember(@PathVariable Long id, @RequestBody Member member) {
//         Member updated = libraryService.updateMember(id, member);

//         if (updated == null) {
//             return "Member not found";
//         }
//         return updated;
//     }

//     // 🔥 DELETE MEMBER
//     @DeleteMapping("/members/{id}")
//     public String deleteMember(@PathVariable Long id) {
//         boolean deleted = libraryService.deleteMember(id);

//         if (!deleted) {
//             return "Member not found";
//         }
//         return "Member deleted successfully";
//     }

//     // ==================== BORROW ====================

//     @PostMapping("/borrow")
//     public Object borrowBook(@RequestParam Long bookId,
//                              @RequestParam Long memberId) {

//         BorrowingRecord record = libraryService.borrowBook(bookId, memberId);

//         if (record == null) {
//             return "Borrow failed (book/member not found or no copies)";
//         }
//         return record;
//     }

//     @PutMapping("/return/{recordId}")
//     public String returnBook(@PathVariable Long recordId) {
//         return libraryService.returnBook(recordId);
//     }

//     // ==================== RECORD ====================

//     @GetMapping("/records")
//     public List<BorrowingRecord> getAllRecords() {
//         return libraryService.getAllRecords();
//     }
// }




// *************************************
// package com.alpha1zln.library.controller;

// import com.alpha1zln.library.model.Book;
// import com.alpha1zln.library.model.Member;
// import com.alpha1zln.library.model.BorrowingRecord;
// import com.alpha1zln.library.service.LibraryService;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api")
// public class LibraryController {

//     private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

//     @Autowired
//     private LibraryService libraryService;

//     // ==================== BOOK ====================

//     @PostMapping("/books")
//     public ResponseEntity<Book> addBook(@RequestBody Book book) {
//         Book saved = libraryService.addBook(book);
//         logger.info("Book added: " + saved);
//         return ResponseEntity.ok(saved);
//     }

//     @GetMapping("/books")
//     public ResponseEntity<List<Book>> getAllBooks() {
//         List<Book> books = libraryService.getAllBooks();
//         logger.info("All books fetched");
//         return ResponseEntity.ok(books);
//     }

//     @GetMapping("/books/{id}")
//     public ResponseEntity<?> getBookById(@PathVariable Long id) {
//         try {
//             Book book = libraryService.getBookById(id);
//             logger.info("Book fetched with id: " + id);
//             return ResponseEntity.ok(book);
//         } catch (RuntimeException e) {
//             logger.error("Book not found with id: " + id);
//             return ResponseEntity.status(404).body(e.getMessage());
//         }
//     }

//     @GetMapping("/books/search")
//     public ResponseEntity<?> searchBooks(@RequestParam String name) {
//         List<Book> books = libraryService.searchBookByName(name);

//         if (books.isEmpty()) {
//             logger.warn("No books found with name: " + name);
//             return ResponseEntity.status(404).body("No books found");
//         }

//         return ResponseEntity.ok(books);
//     }

//     // ==================== MEMBER ====================

//     @PostMapping("/members")
//     public ResponseEntity<Member> addMember(@RequestBody Member member) {
//         Member saved = libraryService.addMember(member);
//         logger.info("Member added: " + saved);
//         return ResponseEntity.ok(saved);
//     }

//     @GetMapping("/members")
//     public ResponseEntity<List<Member>> getAllMembers() {
//         logger.info("Fetching all members");
//         return ResponseEntity.ok(libraryService.getAllMembers());
//     }

//     @GetMapping("/members/{id}")
//     public ResponseEntity<?> getMemberById(@PathVariable Long id) {
//         try {
//             Member member = libraryService.getMemberById(id);
//             return ResponseEntity.ok(member);
//         } catch (RuntimeException e) {
//             logger.error("Member not found with id: " + id);
//             return ResponseEntity.status(404).body(e.getMessage());
//         }
//     }

//     @GetMapping("/members/search")
//     public ResponseEntity<?> searchMembers(@RequestParam String name) {
//         List<Member> members = libraryService.searchMemberByName(name);

//         if (members.isEmpty()) {
//             return ResponseEntity.status(404).body("No members found");
//         }

//         return ResponseEntity.ok(members);
//     }

//     // ==================== BORROW ====================

//     @PostMapping("/borrow")
//     public ResponseEntity<?> borrowBook(
//             @RequestParam Long bookId,
//             @RequestParam Long memberId) {

//         try {
//             BorrowingRecord record = libraryService.borrowBook(bookId, memberId);
//             logger.info("Book borrowed: " + record);
//             return ResponseEntity.ok(record);
//         } catch (RuntimeException e) {
//             logger.error("Borrow failed: " + e.getMessage());
//             return ResponseEntity.status(400).body(e.getMessage());
//         }
//     }

//     @PutMapping("/return/{recordId}")
//     public ResponseEntity<?> returnBook(@PathVariable Long recordId) {
//         try {
//             String message = libraryService.returnBook(recordId);
//             return ResponseEntity.ok(message);
//         } catch (RuntimeException e) {
//             return ResponseEntity.status(404).body(e.getMessage());
//         }
//     }

//     // ==================== RECORD ====================

//     @GetMapping("/records")
//     public ResponseEntity<List<BorrowingRecord>> getAllRecords() {
//         return ResponseEntity.ok(libraryService.getAllRecords());
//     }
// }


/*
package com.alpha1zln.library.controller;

import com.alpha1zln.library.model.Book;
import com.alpha1zln.library.model.Member;
import com.alpha1zln.library.model.BorrowingRecord;
import com.alpha1zln.library.service.LibraryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibraryController {

    private static final Logger logger = LoggerFactory.getLogger(LibraryController.class);

    @Autowired
    private LibraryService libraryService;

    // ==================== BOOK ====================

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        Book bookSaved = libraryService.addBook(book);
        logger.info("Book added: " + bookSaved);
        return bookSaved;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> books = libraryService.getAllBooks();
        logger.info("All books fetched");
        return books;
    }

    // @GetMapping("/books/{id}")
    // public Book getBookById(@PathVariable Long id) {
    //     Book book = libraryService.getBookById(id);
    //     logger.info("Book fetched with id: " + id);
    //     return book;
    // }
    @GetMapping("/books/{id}")
    public ResponseEntity<?> getBookById(@PathVariable Long id) {
        try {
            Book book = libraryService.getBookById(id);
            return ResponseEntity.ok(book);
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    // 🔥 Search by name (IMPORTANT)
    @GetMapping("/books/search")
    public List<Book> searchBooks(@RequestParam String name) {
        logger.info("Searching books with name: " + name);
        return libraryService.searchBookByName(name);
    }

    // ==================== MEMBER ====================

    @PostMapping("/members")
    public Member addMember(@RequestBody Member member) {
        Member memberSaved = libraryService.addMember(member);
        logger.info("Member added: " + memberSaved);
        return memberSaved;
    }

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        logger.info("Fetching all members");
        return libraryService.getAllMembers();
    }

    @GetMapping("/members/{id}")
    public Member getMemberById(@PathVariable Long id) {
        logger.info("Fetching member with id: " + id);
        return libraryService.getMemberById(id);
    }

    // 🔥 Search by name
    @GetMapping("/members/search")
    public List<Member> searchMembers(@RequestParam String name) {
        logger.info("Searching members with name: " + name);
        return libraryService.searchMemberByName(name);
    }

    // ==================== BORROW ====================

    // 🔥 Practical borrow (using IDs)
    @PostMapping("/borrow")
    public BorrowingRecord borrowBook(
            @RequestParam Long bookId,
            @RequestParam Long memberId) {

        BorrowingRecord record = libraryService.borrowBook(bookId, memberId);
        logger.info("Book borrowed. BookId: " + bookId + ", MemberId: " + memberId);

        return record;
    }

    // 🔥 Return book
    @PutMapping("/return/{recordId}")
    public String returnBook(@PathVariable Long recordId) {
        logger.info("Returning book with recordId: " + recordId);
        return libraryService.returnBook(recordId);
    }

    // ==================== RECORD ====================

    @GetMapping("/records")
    public List<BorrowingRecord> getAllRecords() {
        logger.info("Fetching all borrowing records");
        return libraryService.getAllRecords();
    }
}





*/