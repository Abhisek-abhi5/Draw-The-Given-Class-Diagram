
import java.util.*;

class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void addUser(User user) {
        users.add(user);
    }
    
    public boolean lendBook(String bookTitle, int userId) {
        Book book = findBookByTitle(bookTitle);
        User user = findUserById(userId);
        if (book != null && user != null && book.isAvailable()) {
            book.setAvailable(false);
            user.borrowBook(book);
            return true;
        }
        return false;
    }
    
    public void returnBook(String bookTitle, int userId) {
        Book book = findBookByTitle(bookTitle);
        User user = findUserById(userId);
        if (book != null && user != null) {
            book.setAvailable(true);
            user.returnBook(book);
        }
    }
    
    private Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
    
    private User findUserById(int id) {
        for (User u : users) {
            if (u.getUserId() == id) {
                return u;
            }
        }
        return null;
    }
}

class Book {
    private String title;
    private String author;
    private boolean available = true;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class User {
    private int userId;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();
    
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
