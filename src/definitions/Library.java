/*  Created by IntelliJ IDEA.
 *  User: Manendra Singh
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[500];
        for (int i = 0; i < availableBooks.length; i++) {
            this.availableBooks[i] = new Book("Maths", "RD Sharma", "346124643256846");
            this.availableBooks[i] = new Book("physics", "HC Verma", "525862576451");
        }

        public Book[] getAvailableBooks () {
            return availableBooks.clone();
        }
        public void setAvailableBooks (Book[]availableBooks){
            this.availableBooks = availableBooks;
        }
        @Override

    }

    @Override
}
}
