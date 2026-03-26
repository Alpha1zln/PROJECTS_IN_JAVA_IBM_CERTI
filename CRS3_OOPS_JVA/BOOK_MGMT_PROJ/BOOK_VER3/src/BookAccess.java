package src;
import java.util.*;

public class BookAccess {

// SEARCH *****************************************************
    // 🔍 Search by ID
    public static Book getById(ArrayList<Book> books, int id) {
        if (id >= 0 && id < books.size()) return books.get(id);
        return null;
    }

    // 🔍 Search by Title
    public static Book getByTitle(ArrayList<Book> books, String title) {
        for (Book bk : books) {
            if (bk.getTitle().equalsIgnoreCase(title)) return bk;
        }
        return null;
    }

    // 🔍 Search by Author
    public static Book getByAuthor(ArrayList<Book> books, String author) {
        for (Book bk : books) {
            if (bk.getAuthor().equalsIgnoreCase(author)) return bk;
        }
        return null;
    }

    // 🔍 SEARCH MENU
    public static void searchMenu(ArrayList<Book> books, Scanner sc) {
        System.out.println("\nSearch by : 1- ID  2- Title  3- Author");
        String ch = sc.nextLine();

        if (ch.equals("1")) {
            System.out.println("Enter ID:");
            System.out.println(getById(books, Integer.parseInt(sc.nextLine())));
        }
        else if (ch.equals("2")) {
            System.out.println("Enter Title:");
            System.out.println(getByTitle(books, sc.nextLine()));
        }
        else if (ch.equals("3")) {
            System.out.println("Enter Author:");
            System.out.println(getByAuthor(books, sc.nextLine()));
        }
    }

//  COMPARE ************************************************************
    // 💰 COMPARE
    public static void compareMenu(ArrayList<Book> books, Scanner sc) {
        System.out.println("\nCompare by: 1-ID 2-Title 3-Author");
        String ch = sc.nextLine();

        Book b1 = null, b2 = null;

        if (ch.equals("1")) {
            System.out.println("Enter ID1:");
            b1 = getById(books, Integer.parseInt(sc.nextLine()));
            System.out.println("Enter ID2:");
            b2 = getById(books, Integer.parseInt(sc.nextLine()));
        }
        else if (ch.equals("2")) {
            System.out.println("Enter Title1:");
            b1 = getByTitle(books, sc.nextLine());
            System.out.println("Enter Title2:");
            b2 = getByTitle(books, sc.nextLine());
        }
        else if (ch.equals("3")) {
            System.out.println("Enter Author1:");
            b1 = getByAuthor(books, sc.nextLine());
            System.out.println("Enter Author2:");
            b2 = getByAuthor(books, sc.nextLine());
        }

        if (b1 != null && b2 != null) {
            if (b1.getPrice() < b2.getPrice())
                System.out.println(b1.getTitle() + " is cheaper");
            else if (b1.getPrice() > b2.getPrice())
                System.out.println(b2.getTitle() + " is cheaper");
            else
                System.out.println("Same price");
        } else {
            System.out.println("Invalid books");
        }
    }

    // Update **********************************************************
    // ✏️ UPDATE
    public static void updateMenu(ArrayList<Book> books, Scanner sc) {
        System.out.println("\nUpdate by: 1-ID 2-Title 3-Author");
        String ch = sc.nextLine();

        Book b = null;

        if (ch.equals("1")) {
            System.out.println("Enter ID:");
            b = getById(books, Integer.parseInt(sc.nextLine()));
        }
        else if (ch.equals("2")) {
            System.out.println("Enter Title:");
            b = getByTitle(books, sc.nextLine());
        }
        else if (ch.equals("3")) {
            System.out.println("Enter Author:");
            b = getByAuthor(books, sc.nextLine());
        }

        if (b != null) {
            System.out.println("Enter new title:");
            b.setTitle(sc.nextLine());

            System.out.println("Enter new author:");
            b.setAuthor(sc.nextLine());

            System.out.println("Enter new price:");
            b.setPrice(Float.parseFloat(sc.nextLine()));

            System.out.println("Updated successfully");
            } 
            else {
            System.out.println("Book not found");
        }
    }
}