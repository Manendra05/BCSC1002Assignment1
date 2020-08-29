/*  Created by IntelliJ IDEA.
 *  User: Manendra Singh
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 **/
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String bookISBNNumber;

    public Book() {
        this.bookName = "let us c";
        this.authorName = "Yashavant P Kanetkar";
        this.bookISBNNumber = "978-8176566216";
    }

    public Book(String bookName, String authorName, String bookISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;


    }

    /* Now creat getter method for the fields

     */
    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

/*
Now creat setter method for variables
 */

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }

}

