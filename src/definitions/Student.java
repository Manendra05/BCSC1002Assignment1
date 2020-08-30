/*  Created by IntelliJ IDEA.
 *  User: Manendra Singh
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private int universityRollNo;
    private int numberOfBooksIssued;
    private Book[] BooksIssued;

    public Student(String firstName, String middleName, String lastName,
                   int universityRollNo, int numberOfBooksIssued) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNo = universityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Student() {
        this.BooksIssued = new Book[500];
    }
    // creat getter method

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }
    public void setUniversityRollNo(int universityRollNo) {
        this.universityRollNo = universityRollNo;
    }

    // creat setter method

    public Book[] getBooksIssued() {
        return BooksIssued.clone();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    @Override
    public String toString() {
        return Arrays.toString(BooksIssued);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNo() == student.getUniversityRollNo() &&
                getBooksIssued() == student.getBooksIssued() &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(BooksIssued, student.BooksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstName(), getMiddleName(), getLastName(), getUniversityRollNo(), numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(BooksIssued);
        return result;
    }


}




