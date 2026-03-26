
//  ********** BOOK MGMT SYS *********
// 1 view all books
// 2 add book - id, title, author
// 3 search by id, title, author
// 8 exit


PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER2> 
javac -d bin src/*.java      // to store all .class files in bin folder 

PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER2> 
java -cp bin src.BooksMenu        // classpath in bin, src.BookMenu run

 ********** BOOK MGMT SYS *********
1- View Books       2- Add Book
3- Search Book      8- To exit
1
No books are in the sys

 ********** BOOK MGMT SYS *********
1- View Books       2- Add Book
3- Search Book      8- To exit
2
Enter book title
java
Enter book author
ibm
Enter book price
2000

 ********** BOOK MGMT SYS *********
1- View Books       2- Add Book
3- Search Book      8- To exit
2
Enter book title
cpp
Enter book author
harry
Enter book price
500

 ********** BOOK MGMT SYS *********
1- View Books       2- Add Book
3- Search Book      8- To exit
3
Search by (select option) :
1- ID
2- Title
3- Author
1
Enter book index (ID):
1
Book found: Title - java
Author - ibm
Price - 2000.00
1- View Books       2- Add Book
3- Search Book      8- To exit
3
Search by (select option) :
1- ID
2- Title
3- Author
2
Enter title:
JAVA
Found at index 1: Title - java
Author - ibm
Price - 2000.00

 ********** BOOK MGMT SYS *********
1- View Books       2- Add Book
3- Search Book      8- To exit
3
Search by (select option) :
1- ID
2- Title
3- Author
3
Enter author:
harry
Found at index 2: Title - cpp
Author - harry
Price - 500.00

 ********** BOOK MGMT SYS *********
1- View Books       2- Add Book
3- Search Book      8- To exit
8
Exited