package src;
import java.util.ArrayList;
//package src;
import java.util.Scanner;

 // Importing the Scanner class to read input from the user



public class BookMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n------- BOOK MGMT SYS -----------");
            System.out.println("1- View Books       2- Add Book");
            System.out.println("3- Search Book      4- Compare Books");
            System.out.println("5- Update Book      6- Delete Book");
            System.out.println("7- Sort Book        8-Exit");
            
            String userChoice = scanner.nextLine();

            // VIEW
            if (userChoice.equals("1")) {
                if (books.isEmpty()) {
                    System.out.println("No books available");
                } else {
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println("Book id: "+(i+1)+ " details- ");
                        System.out.println(books.get(i));
                    }
                }
            }
            // ADD
            else if (userChoice.equals("2")) {
                System.out.println("Enter title:");
                String title = scanner.nextLine();

                System.out.println("Enter author:");
                String author = scanner.nextLine();

                System.out.println("Enter price:");
                float price = Float.parseFloat(scanner.nextLine());

                books.add(new Book(title, author, price));
            }
            // SEARCH
            else if (userChoice.equals("3")) {
                BookAccess.searchMenu(books, scanner);
            }
            // COMPARE
            else if (userChoice.equals("4")) {
                BookAccess.compareMenu(books, scanner);
            }
            // UPDATE
            else if (userChoice.equals("5")) {
                BookAccess.updateMenu(books, scanner);
            }
            // DELETE
            else if (userChoice.equals("6")) {
                BookAccess.deleteMenu(books, scanner);
            }
            // SORT 
            else if (userChoice.equals("7")) {
                BookAccess.sortMenu(books, scanner);
            }            
            // EXIT 
            else if (userChoice.equals("8")) {
                System.out.println("Exited");
                break;
            }
        }
    }
}