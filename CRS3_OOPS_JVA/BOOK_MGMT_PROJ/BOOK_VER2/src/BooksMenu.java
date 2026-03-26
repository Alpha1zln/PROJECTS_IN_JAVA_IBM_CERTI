package src;

//package src;
import java.util.Scanner;
 // Importing the Scanner class to read input from the user

public class BooksMenu {

    // A helper method to compare two books and return the one with the higher price
    // private static Book getExpensiveBook(Book book1, Book book2) {
    //     if (book1.getPrice() < book2.getPrice()) { // Compare prices of the two books
    //         return book2; // Return the second book if its price is higher
    //     } else {
    //         return book1; // Return the first book otherwise
    //     }
    // }

    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for reading user input
        Book[] books = new Book[11]; // Create an array to store up to 10 Book objects
        int bkIdx = 1; // Initialize the index to keep track of added books

        // Infinite loop to repeatedly display the menu until the user chooses to exit
        while (true) {
            System.out.println(" ********** BOOK MGMT SYS ********* ");
            System.out.println("1- View Books       2- Add Book");
            System.out.println("3- Search Book      8- To exit");
         
            String userAction = scanner.nextLine(); // Read user input for menu selection

            // Option 1: View books
            if (userAction.equals("1")) {
                boolean isEmpty = true;
                for (int i = 1; i < books.length; i++) { // Iterate through the books array
                    if (books[i] != null) { // Check if the current slot contains a Book object
                        System.out.println("Details of book with idx : " + bkIdx);
                        System.out.println(books[i]); // Print the Book details (uses the Book class's toString method)
                        isEmpty = false;                        
                    }
                }

                if(isEmpty == true) {
                    System.out.println("No books are in the sys");
                }
            }
            // Option 2: Add a new book
            else if (userAction.equals("2")) {
                if (bkIdx == 11) { // Check if the books array is already full
                    System.out.println("10 books added already. Cannot add any more books!");
                    continue; // Skip the rest of this iteration and prompt the menu again
                }
                // Prompt the user for book details
                System.out.println("Enter book title");
                String tmpTitle = scanner.nextLine();
                System.out.println("Enter book author");
                String tmpAuthor = scanner.nextLine();
                System.out.println("Enter book price");
                float tmpPrice = Float.parseFloat(scanner.nextLine()); // Convert the price from String to float

                // Create a new Book object and store it in the books array at the current index
				Book bkTmp = new Book();
				bkTmp.setTitle(tmpTitle);
				bkTmp.setAuthor(tmpAuthor);
				bkTmp.setPrice(tmpPrice);
				books[bkIdx++] = bkTmp;
            }
            // Option 3: Compare prices of two books
            else if (userAction.equals("3")) {
                // Prompt the user for the indices of the books to compare
            
                System.out.println("Search by (select option) :");
                System.out.println("1- ID");
                System.out.println("2- Title");
                System.out.println("3- Author");

                String searchChoice = scanner.nextLine();

                // 🔍 Search by ID
                if (searchChoice.equals("1")) {
                    System.out.println("Enter book index (ID):");
                    int id = Integer.parseInt(scanner.nextLine());

                    Book result = BookAccess.searchById(books, id);

                    if (result != null) {
                        System.out.println("Book found: " + result);
                    } else {
                        System.out.println("Book not found");
                    }
                }
                // 🔍 Search by Title
                else if (searchChoice.equals("2")) {
                    System.out.println("Enter title:");
                    String title = scanner.nextLine();
                    BookAccess.searchByTitle(books, title);
                }
                // 🔍 Search by Author
                else if (searchChoice.equals("3")) {
                    System.out.println("Enter author:");
                    String author = scanner.nextLine();
                    BookAccess.searchByAuthor(books, author);
                }
              
            }
            // Exit the program for any other input 
            else if( userAction.equals("8") ) { 
                System.out.println("Exited");
                break; // Break the loop to exit the program
            }
        } 
   

        /*
        🧠 TIME COMPLEXITY (VERY IMPORTANT 🔥)
            Search by ID
                TC = O(1)
                👉 Direct access

            Search by Title / Author
                TC = O(n)
                👉 Loop through array
                
            Space Complexity
                SC = O(1)
                👉 No extra memory
        */
    
    
    }
}
    