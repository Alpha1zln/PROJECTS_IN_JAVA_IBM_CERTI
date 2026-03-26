package src;

public class BookAccess {

    // 🔍 Search by ID (index)
    public static Book searchById(Book[] books, int id) {
        if (id >= 1 && id < books.length && books[id] != null) {
            return books[id];
        }
        return null;
    }

    // 🔍 Search by Title
    public static void searchByTitle(Book[] books, String title) {
        boolean found = false;

        for (int i = 1; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found at index " + i + ": " + books[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    // 🔍 Search by Author
    public static void searchByAuthor(Book[] books, String author) {
        boolean found = false;

        for (int i = 1; i < books.length; i++) {
            if (books[i] != null && books[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Found at index " + i + ": " + books[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with author: " + author);
        }
    }
}