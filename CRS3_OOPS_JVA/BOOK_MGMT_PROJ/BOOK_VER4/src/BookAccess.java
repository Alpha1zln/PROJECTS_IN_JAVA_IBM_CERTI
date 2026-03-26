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

// SEARCH ALL 
    // 🔍 Search ALL by Title
    public static ArrayList<Book> getAllByTitle(ArrayList<Book> books, String title) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                result.add(b);
            }
        }
        return result;
    }

    // 🔍 Search ALL by Author
    public static ArrayList<Book> getAllByAuthor(ArrayList<Book> books, String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                result.add(b);
            }
        }
        return result;
    }




    // 🔍 SEARCH MENU
    // public static void searchMenu(ArrayList<Book> books, Scanner sc) {
    //     System.out.println("\nSearch by : 1- ID  2- Title  3- Author");
    //     String ch = sc.nextLine();

    //     if (ch.equals("1")) {
    //         System.out.println("Enter ID:");
    //         System.out.println(getById(books, Integer.parseInt(sc.nextLine())));
    //     }
    //     else if (ch.equals("2")) {
    //         System.out.println("Enter Title:");
    //         System.out.println(getByTitle(books, sc.nextLine()));
    //     }
    //     else if (ch.equals("3")) {
    //         System.out.println("Enter Author:");
    //         System.out.println(getByAuthor(books, sc.nextLine()));
    //     }
    // }
    
    // or 

    // public static void searchMenu(ArrayList<Book> books, Scanner sc) {

    //     System.out.println("Search by: 1-ID 2-Title 3-Author");
    //     String ch = sc.nextLine();

    //     ArrayList<Book> result = new ArrayList<>();

    //     if (ch.equals("1")) {
    //         System.out.println("Enter ID:");
    //         int id = Integer.parseInt(sc.nextLine());

    //         Book b = getById(books, id);
    //         if (b != null) result.add(b);
    //     }

    //     else if (ch.equals("2")) {
    //         System.out.println("Enter Title:");
    //         result = getAllByTitle(books, sc.nextLine());
    //     }

    //     else if (ch.equals("3")) {
    //         System.out.println("Enter Author:");
    //         result = getAllByAuthor(books, sc.nextLine());
    //     }

    //     // 🔥 DISPLAY RESULTS
    //     if (result.isEmpty()) {
    //         System.out.println("No books found");
    //         return;
    //     }

    //     System.out.println("Search Results:");
    //     for (Book b : result) {
    //         System.out.println(b);
    //     }

    //     // 🔥 ASK FOR SORT
    //     System.out.println("\nDo you want to sort results?");
    //     System.out.println("1- By Title  2- By Price  Any other key = No");

    //     String sortChoice = sc.nextLine();

    //     if (sortChoice.equals("1")) {
    //         sortByTitle(result);
    //     }
    //     else if (sortChoice.equals("2")) {
    //         sortByPrice(result);
    //     }

    //     // 🔥 SHOW SORTED RESULT
    //     System.out.println("\nFinal Results:");
    //     for (Book b : result) {
    //         System.out.println(b);
    //     }
    // }

    // or 
    public static void searchMenu(ArrayList<Book> books, Scanner sc) {

    System.out.println("Search by: 1-ID 2-Title 3-Author");
    String ch = sc.nextLine();

    ArrayList<Book> result = new ArrayList<>();

    if (ch.equals("1")) {
        System.out.println("Enter ID:");
        int id = Integer.parseInt(sc.nextLine());
        Book b = getById(books, id);
        if (b != null) result.add(b);
    }

    else if (ch.equals("2")) {
        System.out.println("Enter Title:");
        result = getAllByTitle(books, sc.nextLine());
    }

    else if (ch.equals("3")) {
        System.out.println("Enter Author:");
        result = getAllByAuthor(books, sc.nextLine());
    }

    if (result.isEmpty()) {
        System.out.println("No books found");
        return;
    }

    // 🔍 SHOW RESULTS
    System.out.println("\nSearch Results:");
    for (Book b : result) System.out.println(b);

    // 🔥 FILTER OPTION
    System.out.println("\nDo you want to filter by price?");
    System.out.println("1- Yes  Any other key- No");

    if (sc.nextLine().equals("1")) {

        System.out.println("Select Price Range:");
        System.out.println("1- <=500");
        System.out.println("2- 501-1000");
        System.out.println("3- >1000");

        int filterChoice = Integer.parseInt(sc.nextLine());

        result = filterByPriceCategory(result, filterChoice);

        System.out.println("\nFiltered Results:");
        for (Book b : result) System.out.println(b);
    }

    // 🔥 SORT OPTION
    System.out.println("\nDo you want to sort by price?");
    System.out.println("1- Yes  Any other key- No");

    if (sc.nextLine().equals("1")) {
        sortOptions(result, sc);
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

// DELETE *****************************************************************
// 🗑️ DELETE MENU
    public static void deleteMenu(ArrayList<Book> books, Scanner sc) {

        System.out.println("Delete by: 1-ID 2-Title 3-Author");
        String ch = sc.nextLine();

        boolean removed = false;

        if (ch.equals("1")) {
            System.out.println("Enter ID:");
            int id = Integer.parseInt(sc.nextLine());

            if (id >= 0 && id < books.size()) {
                books.remove(id);
                removed = true;
            }
        }

        else if (ch.equals("2")) {
            System.out.println("Enter Title:");
            String title = sc.nextLine();

            Iterator<Book> it = books.iterator();
            while (it.hasNext()) {
                if (it.next().getTitle().equalsIgnoreCase(title)) {
                    it.remove();
                    removed = true;
                    break;
                }
            }
        }

        else if (ch.equals("3")) {
            System.out.println("Enter Author:");
            String author = sc.nextLine();

            Iterator<Book> it = books.iterator();
            while (it.hasNext()) {
                if (it.next().getAuthor().equalsIgnoreCase(author)) {
                    it.remove();
                    removed = true;
                    break;
                }
            }
        }

        if (removed) {
            System.out.println("Book deleted successfully");
        } else {
            System.out.println("Book not found");
        }
    }

// sort **********************************************************
    // 🔃 SORT BY TITLE THEN PRICE
    public static void sortByTitleThenPrice(ArrayList<Book> list) {
        Collections.sort(list, (a, b) -> {
            int t = a.getTitle().compareToIgnoreCase(b.getTitle());
            if (t != 0) return t;
            return Float.compare(a.getPrice(), b.getPrice());
        });
    }

// SORT METHODS
// SORT MENU 

    public static void sortMenu(ArrayList<Book> list, Scanner sc) {
        System.out.println("Sort by: 1-Title 2-Author 3-Price");
        String chS = sc.nextLine();

        //ArrayList<Book> result = new ArrayList<>();

        if (chS.equals("1")) {
            System.out.println("Enter Title:");
            sortByTitle(list);
        }
        else if (chS.equals("2")) {
            System.out.println("Enter Author:");
            sortByAuthor(list);
        }
        else if (chS.equals("3")) {
            System.out.println("Sort by Price: 1-Asc 2-Desc 3-Price Range");
            String ch = sc.nextLine();

            if (ch.equals("1")) {
                sortPriceAsc(list);
            } 
            else if (ch.equals("2")) {
                sortPriceDesc(list);
            } 
            else if (ch.equals("3")) {
                System.out.println("Select Range:");
                System.out.println("1- <=1000, 2- 1001-2000, 3- >=2001");
                int rangeCh = Integer.parseInt(sc.nextLine());

                list = filterByPriceCategory(list, rangeCh);  // reuse your filter
                sortPriceAsc(list);
            }         
        }

        if (list.isEmpty()) {
            System.out.println("No books found");
            return;
        }

        System.out.println("Sorted Results:");
        for (Book b : list) {
            System.out.println(b);
        }
    }

// Sort by ID (index order = default, so skip or just print)

    public static void sortByTitle(ArrayList<Book> list) {
        Collections.sort(list, (a, b) -> 
            a.getTitle().compareToIgnoreCase(b.getTitle()));
    }

    public static void sortByAuthor(ArrayList<Book> list) {
        Collections.sort(list, (a, b) -> 
            a.getAuthor().compareToIgnoreCase(b.getAuthor()));
    }

    public static void sortByPrice(ArrayList<Book> list) {
        Collections.sort(list, (a, b) -> 
            Float.compare(a.getPrice(), b.getPrice()));
    }

// sort in depth -----------------------------------------

    // ✅ STEP 1: PRICE SORT OPTIONS
    // 🔃 Sort Price Increasing
    public static void sortPriceAsc(ArrayList<Book> list) {
        Collections.sort(list, (a, b) -> Float.compare(a.getPrice(), b.getPrice()));
    }

    // 🔃 Sort Price Decreasing
    public static void sortPriceDesc(ArrayList<Book> list) {
        Collections.sort(list, (a, b) -> Float.compare(b.getPrice(), a.getPrice()));
    }

    // ✅ STEP 2: PRICE RANGE FILTER (3 OPTIONS)
    public static ArrayList<Book> filterByPriceCategory(ArrayList<Book> books, int choice) {

        ArrayList<Book> result = new ArrayList<>();

        for (Book b : books) {

            if (choice == 1 && b.getPrice() <= 500) {
                result.add(b);
            }
            else if (choice == 2 && b.getPrice() > 500 && b.getPrice() <= 1000) {
                result.add(b);
            }
            else if (choice == 3 && b.getPrice() > 1000) {
                result.add(b);
            }
        }

        return result;
    }

    // 3 ✅ STEP 3: SORT options
        public static void sortOptions(ArrayList<Book> list, Scanner sc) {

        System.out.println("Sort by Price:");
        System.out.println("1- Increasing");
        System.out.println("2- Decreasing");

        String ch = sc.nextLine();

        if (ch.equals("1")) {
            sortPriceAsc(list);
        } else if (ch.equals("2")) {
            sortPriceDesc(list);
        }

        System.out.println("Sorted Results:");
        for (Book b : list) {
            System.out.println(b);
        }
    }

    /*
    🧠 TIME COMPLEXITY
        Step	TC
        Search	O(n)
        Filter	O(n)
        Sort	O(n log n)

    🎯 INTERVIEW GOLD LINE
        Designed a search-filter-sort pipeline allowing dynamic filtering and sorting on user-selected datasets.

    🚀 FINAL STATUS
    👉 Your project is now:
        ** Mod Java project
        → ✅ Mini product with real-world filtering system
    */
}