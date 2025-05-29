import java.util.*;
public class Book {
    private String bookTitle;
    private String authorName;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String bookTitle, String authorName, int publicationYear) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.isAvailable = true; 
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + bookTitle + "' borrowed.");
        } else {
            System.out.println("Book '" + bookTitle + "' is not in stock i think ");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book '" + bookTitle + "' returned.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author name: ");    
        String author = sc.nextLine();
        System.out.print("Enter publication year: ");
        int year = sc.nextInt();
        
        Book book = new Book(title,author, year);

        System.out.println("want to borrow or return the book? (b/r)");
        char choice = sc.next().charAt(0);
        if (choice == 'b' || choice == 'B') {
             book.borrowBook();
        } else if (choice == 'r' || choice == 'R') {
            book.returnBook();
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}