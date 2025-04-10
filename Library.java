import java.util.*;
class Library{

    private Map<String,Book> books = new TreeMap<>();
    private Map<String,User> users = new TreeMap<>();

    // 👇 Book

    public void addBook(Book obj)
    {
        books.put(obj.getId(), obj);
        System.out.println("Book '"+obj.getTitle()+ "' is Successfully Added");
    }
    public void deleteBook(String id)
    {
       if(books.containsKey(id))
       {
        books.remove(id);
        System.out.println("Book '"+id+ "' has been deleted");
       }
       else
        System.out.println("Book '"+id+"' is not found");
    }
    public void availableBook(String id)
    {
        if(books.containsKey(id))
        {
            Book bookAv = books.get(id);
            System.out.println("Available Status: "+ (bookAv.getisAvailable() ? "Available":"Not Available"));
        }
        else
            System.out.println("Book '"+id+"' is not found");
    }
    public void displayBook()
    {
        System.out.printf("%-20s%-30s%-20s%-20s%-20s\n","Id","Title","Author","Genre","ISDN","Availability");
        for (Map.Entry<String, Book> ent : books.entrySet()){
            Book value = ent.getValue();
            System.out.println(value.toString());
        }
    }

    // 👇 User

    public void addUser(User obj)
    {
        users.put(obj.getUserId(),obj);
        System.out.println("User '"+obj.getName()+"' Added");
    }
    public void deleteUser(String id)
    {
        if(users.containsKey(id))
        {
            users.remove(id);
            System.out.println("User '"+id+"' has been deleted");
        }
        else
            System.out.println("User '"+id+"' is not found");
    }
    public void displayUser()
    {
        System.out.printf("%-20s%-20s%-20s\n","UserId","Name","UserType");
        for (Map.Entry<String, User> ent : users.entrySet()){
            User value = ent.getValue();
            System.out.println(value.toString());
        }
    }
    public void borrowBook(String userId,String bookId)
    {
        if (!users.containsKey(userId)) {
            System.out.println("User not found.");
            return;
        }
        if(!books.containsKey(bookId)){
            System.out.println("Book not found");
            return;
        }

        Book book = books.get(bookId);

        if(!book.getisAvailable())
        {
            System.out.println("Book is not currently Available");
            return;
        }
        book.setAvailable(false);
        users.get(userId).addBorrowBook(bookId);
        System.out.println("Book Borrowed By User: "+users.get(userId).getName());
    }

    public void returnBook(String userId,String bookId)
    {
        if (!users.containsKey(userId)) {
            System.out.println("User not found.");
            return;
        }

        if (!books.containsKey(bookId)) {
            System.out.println("Book not found.");
            return;
        }
    
        Book book = books.get(bookId);
        User user = users.get(userId);
    
        if (book.getisAvailable()) {
            System.out.println("Book is not borrowed by AnyOne.");
            return;
        }

        if(!user.getBorrowedBooks().contains(bookId))
        {
            System.out.println("You not borrow this book");
            return;
        }

        book.setAvailable(true);
        users.get(userId).removeBorrowBook(bookId);
        
        System.out.println("Book Return by User: "+user.getName());
    }
}