import java.util.*;
class Library{

    //👇 Collections

    private Map<String,Book> books = new TreeMap<>();
    private Map<String,User> users = new TreeMap<>();
    private Map<User,List<Book>> borrow = new TreeMap<>();
    private Queue<User> reservation = new LinkedList<>();
    private String admin = "Admin",password ="Lib@123";
    // 👇 Adding Books
    {
        books.put("The Alchemist", new Book("The Alchemist", "Paulo Coelho", "Adventure, Fantasy", "9780061122415"));
        books.put("Harry Potter and the Sorcerer's Stone", new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy", "9780590353403"));
        books.put("Atomic Habits", new Book("Atomic Habits", "James Clear", "Self-help", "9780735211292"));
        books.put("The Da Vinci Code", new Book("The Da Vinci Code", "Dan Brown", "Mystery, Thriller", "9780385504208"));
        books.put("Rich Dad Poor Dad", new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", "Personal Finance", "9781612680194"));
        books.put("To Kill a Mockingbird", new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "9780061120084"));
        books.put("1984", new Book("1984", "George Orwell", "Dystopian, Political Fiction", "9780451524935"));
        books.put("The Great Gatsby", new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic", "9780743273565"));
        books.put("The Catcher in the Rye", new Book("The Catcher in the Rye", "J.D. Salinger", "Classic, Fiction", "9780316769488"));
        books.put("Think and Grow Rich", new Book("Think and Grow Rich", "Napoleon Hill", "Self-help, Business", "9781585424337"));
        books.put("Sapiens", new Book("Sapiens", "Yuval Noah Harari", "History, Non-fiction", "9780062316110"));
        books.put("The Power of Now", new Book("The Power of Now", "Eckhart Tolle", "Spirituality, Self-help", "9781577314806"));
        books.put("The Subtle Art of Not Giving a F*ck", new Book("The Subtle Art of Not Giving a F*ck", "Mark Manson", "Self-help", "9780062457714"));
        books.put("The 7 Habits of Highly Effective People", new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey", "Self-help, Leadership", "9780743269513"));
        books.put("Ikigai", new Book("Ikigai", "Héctor García, Francesc Miralles", "Self-help, Japanese Philosophy", "9780143130727"));
        books.put("The Monk Who Sold His Ferrari", new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "Self-help, Inspirational", "9780062515674"));
        books.put("Can't Hurt Me", new Book("Can't Hurt Me", "David Goggins", "Memoir, Self-help", "9781544512280"));
        books.put("Deep Work", new Book("Deep Work", "Cal Newport", "Productivity, Self-help", "9781455586691"));
        books.put("The Psychology of Money", new Book("The Psychology of Money", "Morgan Housel", "Finance, Self-help", "9789390166268"));
        books.put("Start With Why", new Book("Start With Why", "Simon Sinek", "Leadership, Motivation", "9781591846444"));
        books.put("Make Your Bed", new Book("Make Your Bed", "William H. McRaven", "Motivational, Life Lessons", "9781455570249"));
        books.put("Man's Search for Meaning", new Book("Man's Search for Meaning", "Viktor E. Frankl", "Psychology, Memoir", "9780807014271"));
        books.put("Wings of Fire", new Book("Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography, Inspirational", "9788173711466"));
        books.put("Zero to One", new Book("Zero to One", "Peter Thiel", "Startup, Business", "9780804139298"));
        books.put("Rework", new Book("Rework", "Jason Fried, David Heinemeier Hansson", "Business, Productivity", "9780307463746"));
        books.put("Steve Jobs", new Book("Steve Jobs", "Walter Isaacson", "Biography", "9781451648539"));
        books.put("Elon Musk", new Book("Elon Musk", "Ashlee Vance", "Biography, Technology", "9780062301239"));
        books.put("Outliers", new Book("Outliers", "Malcolm Gladwell", "Psychology, Success", "9780316017930"));
        books.put("Grit", new Book("Grit", "Angela Duckworth", "Motivation, Psychology", "9781501111105"));
        books.put("The Lean Startup", new Book("The Lean Startup", "Eric Ries", "Entrepreneurship", "9780307887894"));
        books.put("Cracking the Coding Interview", new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", "Interview Preparation", "9780984782857"));
        books.put("Clean Code", new Book("Clean Code", "Robert C. Martin", "Programming, Software Engineering", "9780132350884"));
        books.put("Design Patterns", new Book("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "Software Design", "9780201633610"));
        books.put("Introduction to Algorithms", new Book("Introduction to Algorithms", "Thomas H. Cormen", "Computer Science", "9780262033848"));
        books.put("You Don’t Know JS", new Book("You Don’t Know JS", "Kyle Simpson", "JavaScript, Programming", "9781491904244"));
        books.put("Effective Java", new Book("Effective Java", "Joshua Bloch", "Programming, Java", "9780134685991"));
        books.put("Head First Design Patterns", new Book("Head First Design Patterns", "Eric Freeman", "Programming, Design", "9780596007126"));
        books.put("Refactoring", new Book("Refactoring", "Martin Fowler", "Software Engineering", "9780201485677"));
        books.put("The Pragmatic Programmer", new Book("The Pragmatic Programmer", "Andrew Hunt, David Thomas", "Software Development", "9780201616224"));
        books.put("Soft Skills", new Book("Soft Skills", "John Sonmez", "Career, Development", "9781617292392"));
        books.put("The Hitchhiker's Guide to the Galaxy", new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "Sci-Fi, Comedy", "9780345391803"));
        books.put("Good Omens", new Book("Good Omens", "Neil Gaiman & Terry Pratchett", "Fantasy, Humor", "9780060853983"));
        books.put("Where'd You Go, Bernadette", new Book("Where'd You Go, Bernadette", "Maria Semple", "Comedy, Fiction", "9780316332313"));
        books.put("Bossypants", new Book("Bossypants", "Tina Fey", "Comedy, Memoir", "9780316056861")); 
        books.put("The Rosie Project", new Book("The Rosie Project", "Graeme Simsion", "Romance, Comedy", "9781444742924"));
    }

    //👇 Adding students
    
    {
        users.put("1", new User("1", "Saran", "Student"));
        users.put("2", new User("2", "Alex", "Student"));
        users.put("3", new User("3", "Shelby", "Student"));
        users.put("4", new User("4", "John", "Student"));
        users.put("5", new User("5", "Emily", "Student"));
        users.put("6", new User("6", "Michael", "Student"));
        users.put("7", new User("7", "Sophia", "Student"));
        users.put("8", new User("8", "Daniel", "Student"));
        users.put("9", new User("9", "Olivia", "Student"));
        users.put("10", new User("10", "Liam", "Student"));
        users.put("11", new User("11", "Ava", "Student"));
        users.put("12", new User("12", "Noah", "Student"));
        users.put("13", new User("13", "Isabella", "Student"));
        users.put("14", new User("14", "Lucas", "Student"));
        users.put("15", new User("15", "Mason", "Student"));
        users.put("16", new User("16", "Amelia", "Student"));
        users.put("17", new User("17", "Ethan", "Student"));
        users.put("18", new User("18", "Harper", "Student"));
        users.put("19", new User("19", "James", "Student"));
        users.put("20", new User("20", "Ella", "Student"));
        users.put("21", new User("21", "Mr. Smith", "Staff"));
        users.put("22", new User("22", "Mrs. Johnson", "Staff"));
        users.put("23", new User("23", "Dr. Williams", "Staff"));
        users.put("24", new User("24", "Ms. Brown", "Staff"));
        users.put("25", new User("25", "Mr. Taylor", "Staff"));
        users.put("26", new User("26", "Mrs. Anderson", "Staff"));
        users.put("27", new User("27", "Mr. Thomas", "Staff"));
        users.put("28", new User("28", "Dr. Jackson", "Staff"));
        users.put("29", new User("29", "Ms. White", "Staff"));
        users.put("30", new User("30", "Mr. Harris", "Staff"));
    }

    //👇 Getters

    public String getAdmin() {
        return admin;
    }

    public String getPassword() {
        return password;
    }

    public String getName(String id)
    {
        User user = users.get(id);
        return user.getName();
    }
    // 👇 Book Methods

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

    // 👇 User Methods

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
            System.out.println("Book is not Available.You are added in Queue..");
            addReservation(user);
            return;
        }
        boolean ch = users.get(userId).addBorrowBook(book);
        if(!ch){
            borrow.put(user,user.getBorrowedBooks());
            book.setAvailable(false);
            System.out.println("Book Borrowed By User: "+users.get(userId).getName());
        }
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
            System.out.println("Book is not borrowed by You.");
            return;
        }

        if(!user.getBorrowedBooks().contains(book))
        {
            System.out.println("You not borrow this book");
            return;
        }

        users.get(userId).removeBorrowBook(book);
        book.setAvailable(true);
        if(user.getBorrowedBooks().isEmpty())
            borrow.remove(user);
        System.out.println("Book Return by User: "+user.getName());
        if(!hasNext())
        {
            User nextUser = getNext();
            book.setAvailable(false);
            nextUser.addBorrowBook(book);
            borrow.put(nextUser, nextUser.getBorrowedBooks());
            System.out.println("Book is assigned to next reserved user : "+nextUser.getName());
        }
    }

    public void displayBorrow()
    {
        boolean check = false;
        for(Map.Entry<User,List<Book>> element : borrow.entrySet())
        {
            User user = element.getKey();
            System.out.println("Borrowed User and Book List");
            check =true;
            System.out.printf("%-30s%-30s%-30s%-20s\n","Title","Author","Genre","ISBN");
            System.out.println("Book Borrowed by User '"+user.getName()+"'  : \n");
            List<Book> ele = element.getValue();
            for(Book el : ele)
            {
                System.out.println(el);
            }
            
        }
        if(!check)
            System.out.println("None Borrow Books Form Library..");
    }

    // 👇 Search Methods

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

    // 👇 Reservation Methods

    public void addReservation(User obj)
    {
        reservation.add(obj);
    }
    public User getNext()
    {
        return reservation.poll();
    }
    public boolean hasNext()
    {
        return reservation.isEmpty();
    }
    public void displayReservation()
    {
        if(reservation.isEmpty())
        {
            System.out.println("Currently None is waiting in reservation");
            return;
        }
        System.out.printf("%-20s%-20s%-20s\n","UserId","Name","UserType");
        for(User user : reservation)
        {
            System.out.println(user);
        }
    }
}