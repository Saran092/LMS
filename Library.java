import java.util.*;
class Library{

    private Map<String,Book> books = new TreeMap<>();
    private Map<String,User> users = new TreeMap<>();
    private Map<User,List<Book>> borrow = new TreeMap<>();

    public String getName(String id)
    {
        User user = users.get(id);
        return user.getName();
    }
    // 👇 Book

    public void addBook(Book obj)
    {
        if(books.isEmpty()){
            books.put(obj.getTitle(), obj);
            System.out.println("Book '"+obj.getTitle()+ "' is Successfully Added");
        }
        else{
            if(!books.containsKey(obj.getTitle()))
            {
                books.put(obj.getTitle(), obj);
                System.out.println("Book '"+obj.getTitle()+ "' is Successfully Added");
            }
            else
                System.out.println("Book is Already in the Library");
        }
    }
    public void deleteBook(String title)
    {
       if(books.containsKey(title))
       {
        books.remove(title);
        System.out.println("Book '"+title+ "' has been deleted");
       }
       else
        System.out.println("Book '"+title+"' is not found");
    }
    public void availableBook(String title)
    {
        if(books.containsKey(title))
        {
            Book bookAv = books.get(title);
            System.out.println("Available Status: "+ (bookAv.getisAvailable() ? "Available":"Not Available"));
        }
        else
            System.out.println("Book '"+title+"' is not in the Library");
    }
    public void displayBook()
    {
        System.out.printf("%-30s%-30s%-30s%-20s\n","Title","Author","Genre","ISDN");
        for (Map.Entry<String, Book> ent : books.entrySet()){
            Book value = ent.getValue();
            System.out.println(value.toString());
        }
    }

    // 👇 User

    public void addUser(User obj)
    {
        if(users.isEmpty()){
            users.put(obj.getUserId(),obj);
            System.out.println("User '"+obj.getName()+"' Added");
        }
        else{
            if(users.containsKey(obj.getUserId()))
            {
                System.out.println("User '"+obj.getUserId()+"' Already Exist Try Different User ID");
            }
            else
            {
                users.put(obj.getUserId(),obj);
                System.out.println("User '"+obj.getName()+"' Added");
            }
        }
    }
    public void deleteUser(String id)
    {
        User userId = users.get(id);
        if(users.containsKey(id))
        {
            users.remove(id);
            System.out.println("User '"+userId.getName()+"' has been deleted");
        }
        else
            System.out.println("User '"+userId.getName()+"' is not found");
    }
    public void displayUser()
    {
        System.out.printf("%-20s%-20s%-20s\n","UserId","Name","UserType");
        for (Map.Entry<String, User> ent : users.entrySet()){
            User value = ent.getValue();
            System.out.println(value.toString());
        }
    }
    public void borrowBook(String userId,String booktit)
    {
        if (!users.containsKey(userId)) {
            System.out.println("User not found.");
            return;
        }
        if(!books.containsKey(booktit)){
            System.out.println("Book not found");
            return;
        }

        Book book = books.get(booktit);
        User user = users.get(userId);
        if(!book.getisAvailable())
        {
            System.out.println("Book already borrowed");
            return;
        }
        book.setAvailable(false);
        users.get(userId).addBorrowBook(book);
        borrow.put(user,user.getBorrowedBooks());
        System.out.println("Book Borrowed By User: "+users.get(userId).getName());
    }

    public void returnBook(String userId,String booktit)
    {
        if (!users.containsKey(userId)) {
            System.out.println("User not found.");
            return;
        }

        if (!books.containsKey(booktit)) {
            System.out.println("Book not found.");
            return;
        }
    
        Book book = books.get(booktit);
        User user = users.get(userId);
    
        if (book.getisAvailable()) {
            System.out.println("Book is not borrowed by AnyOne.");
            return;
        }

        if(!user.getBorrowedBooks().contains(book))
        {
            System.out.println("You not borrow this book");
            return;
        }

        book.setAvailable(true);
        users.get(userId).removeBorrowBook(book);
        if(user.getBorrowedBooks().isEmpty())
            borrow.remove(user);
        System.out.println("Book Return by User: "+user.getName());
    }

    public void displayBorrow()
    {
        System.out.printf("%-30s%-30s%-30s%-20s\n","Title","Author","Genre","ISBN");
        for(Map.Entry<User,List<Book>> element : borrow.entrySet())
        {
            User user = element.getKey();
            System.out.println("Book Borrowed by User '"+user.getName()+"'  : \n");
            List<Book> ele = element.getValue();
            for(Book el : ele)
            {
                System.out.println(el);
            }
        }
    }

    // 👇 Secarch
    public void searchAuthor(String author)
    {
        boolean check = false;
        for(Map.Entry<String,Book> elm : books.entrySet())
        {
            Book value = elm.getValue();
            if(value.getAuthor().toLowerCase().contains(author.toLowerCase()))
            {
                if(!check)
                    System.out.printf("%-30s%-30s%-30s%-20s%-20s\n","Title","Author","Genre","ISBN","Available");
                System.out.print(value);
                availableBook(value.getTitle());
                check= true;
            }
        }
        if(!check)
            System.out.println("No Author'S Book is available in the library");
    }

    public void searchGenre(String genre)
    {
        boolean check = false;
        for(Map.Entry<String,Book> elm : books.entrySet())
        {
            Book value = elm.getValue();
            if(value.getGenre().toLowerCase().contains(genre.toLowerCase()))
            {
                if(!check)
                    System.out.printf("%-30s%-30s%-30s%-20s%-20s\n","Title","Author","Genre","ISBN","Available");
                System.out.print(value);
                availableBook(value.getTitle());
                check= true;
            }
        }
        if(!check)
            System.out.println("No Genreis available in the library");
    }

    public void searchTitle(String title)
    {
        boolean check = false;
        for(Map.Entry<String,Book> elm : books.entrySet())
        {
            Book value = elm.getValue();
            if(value.getTitle().toLowerCase().contains(title.toLowerCase()))
            {
                if(!check)
                    System.out.printf("%-30s%-30s%-30s%-20s%-20s\n","Title","Author","Genre","ISBN","Available");
                    System.out.print(value);
                    availableBook(value.getTitle());
                    check= true;
            }
        }
        if(!check)
            System.out.println("No Title available in the library");
    }
}