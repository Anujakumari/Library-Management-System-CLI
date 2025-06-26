package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getuserName());
    }

    public void issueBook(int bookId, int userId) {
    	
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (user == null) {
            System.out.println("User not found.");
        } else if (book.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            book.issue();
            System.out.println("Book issued to " + user.getuserName());
        }
    }

    public void returnBook(int bookId) {
    	
        Book book = findBook(bookId);
        if (book != null && book.isIssued()) {
            book.returnBook();
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found or not issued.");
        }
    }

    public void showAllBooks() {
    	
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private Book findBook(int bookId) {
    	
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }


    private User findUser(int userId) {
    	
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

}

