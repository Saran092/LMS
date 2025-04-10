import java.util.*;
public class User {
    private String userId,name,userType;
    private List<String> borrowedBooks;

    public User() {
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

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }
    
    public void addBorrowBook(String id)
    {
        borrowedBooks.add(id);
    }

    public void removeBorrowBook(String id)
    {
        borrowedBooks.remove(id);
    }
    
}
