package library;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        System.out.println("Welcome to the Library Management System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add New Book");
            System.out.println("2. Add New User");
            System.out.println("3. Show All Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    
                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter User Name: ");
                    String userName = sc.nextLine();
                    
                    User user = new User(userId, userName);
                    library.addUser(user);
                    break;

                case 3:
                    System.out.println("Books in Library:");
                    library.showAllBooks();
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int issueUserId = sc.nextInt();
                    library.issueBook(issueBookId, issueUserId);
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = sc.nextInt();
                    library.returnBook(returnBookId);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

