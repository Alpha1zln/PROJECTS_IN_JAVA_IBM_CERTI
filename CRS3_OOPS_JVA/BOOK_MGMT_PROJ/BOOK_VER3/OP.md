// op of ver 3 ************************************

//  ********** BOOK MGMT SYS *********
// 1 view all books
// 2 add book - id, title, author
// 3 search by id, title, author
// 4 compare by all 3 atbs
// 5 update by all 3 atbs
// 8 exit


PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER2> 
javac -d bin src/*.java      // to store all .class files in bin folder 

PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER2> 
java -cp bin src.BooksMenu        // classpath in bin, src.BookMenu run

PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER3> javac -d bin src/*.java   
PS E:\COURSERA\IBM_COURSE\CRS3_OOPS_JVA\BOOK_MGMT_PROJ\BOOK_VER3> java -cp bin src.BookMenu

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
1
No books available

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
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
5- Update Book      8-Exit
2
Enter title:
nodejs
Enter author:
apnacollege
Enter price:
8000

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
1
0 -> Title - java
Author - telusko
Price - 1000.00
1 -> Title - nodejs
Author - apnacollege
Price - 8000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
3

Search by : 1- ID  2- Title  3- Author
1
Enter ID:
1 
Title - nodejs
Author - apnacollege
Price - 8000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
3

Search by : 1- ID  2- Title  3- Author
2
Enter Title:
java
Title - java
Author - telusko
Price - 1000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
3

Search by : 1- ID  2- Title  3- Author
3
Enter Author:
telusko
Title - java
Author - telusko
Price - 1000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
4

Compare by: 1-ID 2-Title 3-Author
1
Enter ID1:
0
Enter ID2:
1
java is cheaper

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
4

Compare by: 1-ID 2-Title 3-Author
2
Enter Title1:
java
Enter Title2:
nodejs
java is cheaper

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
4

Compare by: 1-ID 2-Title 3-Author
3
Enter Author1:
harry
Enter Author2:
telusko
Invalid books

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
5

Update by: 1-ID 2-Title 3-Author
2
Enter Title:
nodejs
Enter new title:
Nodejs
Enter new author:
Meta
Enter new price:
2000
Updated successfully

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
1
0 -> Title - java
Author - telusko
Price - 1000.00
1 -> Title - Nodejs
Author - telusko
Price - 1000.00
1 -> Title - Nodejs
Price - 1000.00
1 -> Title - Nodejs
1 -> Title - Nodejs
Author - Meta
Price - 2000.00

------- BOOK MGMT SYS -----------
1- View Books       2- Add Book
1- View Books       2- Add Book
1- View Books       2- Add Book
1- View Books       2- Add Book
1- View Books       2- Add Book
3- Search Book      4- Compare Books
5- Update Book      8-Exit
8
Exited