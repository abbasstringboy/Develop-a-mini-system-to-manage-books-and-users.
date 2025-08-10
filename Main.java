// Main.java (Demo)
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add Books
        library.addBook(new Book(1, "Java Basics", "Author A"));
        library.addBook(new Book(2, "Python Fundamentals", "Author B"));

        // Add Users
        library.addUser(new User(101, "Alice"));
        library.addUser(new User(102, "Bob"));

        // Display Books
        System.out.println("All Books:");
        library.showAllBooks();

        // Issue a Book
        System.out.println("\nIssuing Book ID 1 to User ID 101:");
        library.issueBook(1, 101);

        // Try issuing the same book again
        library.issueBook(1, 102);

        // Return a Book
        System.out.println("\nReturning Book ID 1:");
        library.returnBook(1);

        // Display Books after return
        System.out.println("\nBooks after return:");
        library.showAllBooks();
    }
}
