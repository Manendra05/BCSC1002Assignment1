/*  Created by IntelliJ IDEA.
 *  User: Manendra Singh
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int EXIT = 4;
    public static final int ISSUE_A_BOOK = 1;
    public static final int RETURN_PREVIOUSLY_ISSUED_BOOKS = 2;
    public static final int SHOW_ALL_BOOKS_ISSUED = 3;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        Book bookObject = new Book();
        Library libraryObject = new Library();
        Student studentObject = new Student();
        System.out.println(" Please enter first name");
        String firstName = scannerObject.nextLine();
        System.out.println("Please enter middle Name");
        String middleName = scannerObject.nextLine();
        System.out.println("Please enter last Name");
        String lastName = scannerObject.nextLine();
        System.out.println("Please enter University Roll NO");
        Long rollNumber = scannerObject.nextLong();

        scannerObject.nextLine();
        System.out.println("-=-=--=-=-\"Welcome," + firstName + ", To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        System.out.println("Enter your choice from 1-4");


    }
