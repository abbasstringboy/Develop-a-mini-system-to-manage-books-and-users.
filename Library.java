// Library.java
import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void issueBook(int bookId, int userId) {
        Book bookToIssue = findBook(bookId);
        User user = findUser(userId);

        if (bookToIssue == null) {
            System.out.println("Book not found!");
            return;
        }
        if (user == null) {
            System.out.println("User not found!");
            return;
        }
        if (bookToIssue.isIssued()) {
            System.out.println("Book is already issued!");
        } else {
            bookToIssue.setIssued(true);
            System.out.println("Book '" + bookToIssue.getTitle() +
                               "' issued to " + user.getName());
        }
    }

    public void returnBook(int bookId) {
        Book bookToReturn = findBook(bookId);
        if (bookToReturn != null && bookToReturn.isIssued()) {
            bookToReturn.setIssued(false);
            System.out.println("Book returned: " + bookToReturn.getTitle());
        } else {
            System.out.println("Book not found or is not issued.");
        }
    }

    public void showAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private Book findBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId) return b;
        }
        return null;
    }

    private User findUser(int userId) {
        for (User u : users) {
            if (u.getId() == userId) return u;
        }
        return null;
    }
}
