import java.util.*;
public class User implements Comparable<User>{
    private String userId,name,userType;
    private List<Book> borrowedBooks;

    // public User() {
    // }
    public int compareTo(User obj)
    {
        return this.userId.compareTo(obj.userId);
    }

    public User(String userId, String name, String userType) {
        this.userId = userId;
        this.name = name;
        this.userType = userType;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s",userId,name,userType);
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    
    public void addBorrowBook(Book obj)
    {
        borrowedBooks.add(obj);
    }

    public void removeBorrowBook(Book obj)
    {
        borrowedBooks.remove(obj);
    }
    
}
