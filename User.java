import java.util.*;
public class User implements Comparable<User>{
    private String userId,name,userType;
    private List<Book> borrowedBooks;
    private Integer maxSize =0;
    
    public int compareTo(User obj)
    {
        return this.userId.compareTo(obj.userId);
    }

    public User(String userId, String name, String userType) {
        this.userId = userId;
        this.name = name;
        this.userType = userType;
        this.borrowedBooks = new ArrayList<>();
        this.maxSize = 0;
    }
    
    //👇 Getters

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getUserType() {
        return userType;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20s",userId,name,userType);
    }
    
    // 👇 Methods
    
    public boolean addBorrowBook(Book obj)
    {
        if(this.maxSize < 2){
            borrowedBooks.add(obj);
            this.maxSize++;
            setMaxSize(maxSize);
        }
        else
        {
            System.out.println("You Reach your Borrow Limit");
            return true;
        }
        return false;
    }

    public void removeBorrowBook(Book obj)
    {
        if(!borrowedBooks.isEmpty()){
            borrowedBooks.remove(obj);
            this.maxSize--;
            setMaxSize(maxSize);
        }
        else
        {
            System.out.println("No Book is Borrowed by You");
        }
    }
}
