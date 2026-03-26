// op of ver 4 ************************************

//  ********** BOOK MGMT SYS *********
// 1 view all books
// 2 add book - id, title, author
// 3 search by id, title, author
// 4 compare by all 3 atbs
// 5 update by all 3 atbs

// added in ver 4 ---
// 6 delete by all 3 atbs
// 7 sort by price 
// 8 exit


PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER2> 
javac -d bin src/*.java      // to store all .class files in bin folder 

PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER2> 
java -cp bin src.BooksMenu        // classpath in bin, src.BookMenu run


PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER4> javac -d bin src/*.java  
PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER4> java -cp bin src.BookMenu

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
1
No books available

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
java
Enter author:
telusko
Enter price:
1000

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
java
Enter author:
ranga 
Enter price:
2000

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
cpp
Enter author:
microsoft
Enter price:
1001

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
3
Search by: 1-ID 2-Title 3-Author
java
No books found

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
3   
Search by: 1-ID 2-Title 3-Author
2
Enter Title:
java

Search Results:
Title - java
Author - telusko
Price - 1000.00
Title - java
Author - ranga
Price - 2000.00

Do you want to filter by price?
1- Yes  Any other key- No
1
Select Price Range:
1- <=500
2- 501-1000
3- >1000
2

Filtered Results:
Title - java
Author - telusko
Price - 1000.00

Do you want to sort by price?
1- Yes  Any other key- No
1
Sort by Price:
1- Increasing
2- Decreasing
1
Sorted Results:
Title - java
Author - telusko
Price - 1000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
java
Enter author:
codingWallah
Enter price:
8000

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
4

Compare by: 1-ID 2-Title 3-Author
2
Enter Title1:
java
Enter Title2:
java
Same price

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
7
Books sorted successfully!

------- BOOK MGMT SYS -----------

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
7- Sort Book        8-Exit
7
7
Books sorted successfully!
Books sorted successfully!


------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
1- View Books       2- Add Book
3- Search Book      4- Compare Books
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
Exception in thread "main" java.util.NoSuchElementException: No line found
        at java.base/java.util.Scanner.nextLine(Scanner.java:1660)
        at src.BookMenu.main(BookMenu.java:24)
PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER4> javac -d bin src/*.java  
PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER4> java -cp bin src.BookMenu

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
1
No books available

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
java
Enter author:
telusko
Enter price:
1000

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
Java
Enter author:
ranga
Enter price:
2000

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
codingWlh 
Enter author:
utb
Enter price:
100

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
5

Update by: 1-ID 2-Title 3-Author
2
Enter Title:
codingWlh
Enter new title:
JAVA    
Enter new author:
CodingWlh
Enter new price:
100
Updated successfully

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
cpp
Enter author:
harry
Enter price:
800

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
1
Book id: 1 details- 
Title - java
Author - telusko
Price - 1000.00
Book id: 2 details- 
Title - Java
Author - ranga
Price - 2000.00
Book id: 3 details-
Title - JAVA
Author - CodingWlh
Price - 100.00
Book id: 4 details-
Title - cpp
Author - harry
Price - 800.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
4

Compare by: 1-ID 2-Title 3-Author
2
Enter Title1:
java
Enter Title2:
cpp
cpp is cheaper

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
7
Sort by: 1-Title 2-Author 3-Pricer
7
Sorted Results:
Title - java
Author - telusko
Price - 1000.00
Title - Java
Author - ranga
Price - 2000.00
Title - JAVA
Author - CodingWlh
Price - 100.00
Title - cpp
Author - harry
Price - 800.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
7
Sort by: 1-Title 2-Author 3-Pricer
2
Enter Author:
Sorted Results:
Title - JAVA
Author - CodingWlh
Price - 100.00
Title - cpp
Author - harry
Price - 800.00
Title - Java
Author - ranga
Price - 2000.00
Title - java
Author - telusko
Price - 1000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
7
Sort by: 1-Title 2-Author 3-Pricer
3
Sort by Price: 1-Asc 2-Desc
2
Sorted Results:
Title - Java
Author - ranga
Price - 2000.00
Title - java
Author - telusko
Price - 1000.00
Title - cpp
Author - harry
Price - 800.00
Title - JAVA
Author - CodingWlh
Price - 100.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
3
Search by: 1-ID 2-Title 3-Author
2
Enter Title:
java

Search Results:
Title - Java
Author - ranga
Price - 2000.00
Title - java
Author - telusko
Price - 1000.00
Title - JAVA
Author - CodingWlh
Price - 100.00

Do you want to filter by price?
1- Yes  Any other key- No
1
Select Price Range:
1- <=500
2- 501-1000
3- >1000
2

Filtered Results:
Title - java
Author - telusko
Price - 1000.00

Do you want to sort by price?
1- Yes  Any other key- No
1
Sort by Price:
1- Increasing
2- Decreasing
2
Sorted Results:
Title - java
Author - telusko
Price - 1000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
java
Enter author:
anuj
Enter price:
1200

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
3
Search by: 1-ID 2-Title 3-Author
2
Enter Title:
java

Search Results:
Title - Java
Author - ranga
Price - 2000.00
Title - java
Author - telusko
Price - 1000.00
Title - JAVA
Author - CodingWlh
Price - 100.00
Title - java
Author - anuj
Price - 1200.00

Do you want to filter by price?
1- Yes  Any other key- No
1
Select Price Range:
1- <=500
2- 501-1000
3- >1000
3

Filtered Results:
Title - Java
Author - ranga
Price - 2000.00
Title - java
Author - anuj
Price - 1200.00

Do you want to sort by price?
1- Yes  Any other key- No
1
Sort by Price:
1- Increasing
2- Decreasing
1
Sorted Results:
Title - java
Author - anuj
Price - 1200.00
Title - Java
Author - ranga
Price - 2000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
2
Enter title:
asd
Enter author:
asdd
Enter price:
12345

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
6
Delete by: 1-ID 2-Title 3-Author
2
Enter Title:
asd
Book deleted successfully

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
1
Book id: 1 details- 
Title - Java
Author - ranga
Price - 2000.00
Book id: 2 details-
Title - java
Author - telusko
Price - 1000.00
Book id: 3 details-
Title - cpp
Author - harry
Price - 800.00
Book id: 4 details-
Title - JAVA
Author - CodingWlh
Price - 100.00
Book id: 5 details-
Title - java
Author - anuj
Price - 1200.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      6- Delete Book
7- Sort Book        8-Exit
8
Exited


/*
✅ ✅ VERSION 4 FEATURES

🗑️ Delete book by:
ID
Title
Author

🔃 Sort books:
By Title
Then by Price
*/