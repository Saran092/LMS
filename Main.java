import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        //👇 Variables
        int choice,Bchoice,Uchoice,Schoice;

        // 👇Book Management
        String title,author,genre,isbn;

        // 👇 User
        String userId,name,userType;

        //👇 Object
        Library library = new Library();
        // User userObj = new User();

        // 👇 Testing Dummy Values for Book
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "Adventure, Fantasy", "9780061122415");
        Book b2 = new Book("Harry Potter", "J.K. Rowling", "Fantasy", "9780590353403");
        Book b3 = new Book("Atomic Habits", "James Clear", "Self-help", "9780735211292");
        Book b4 = new Book("The Da Vinci Code", "Dan Brown", "Mystery, Thriller", "9780385504208");
        Book b5 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", "Personal Finance", "9781612680194");
        Book b6 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "9780061120084");
        Book b7 = new Book("1984", "George Orwell", "Dystopian, Political Fiction", "9780451524935");
        Book b8 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic, Tragedy", "9780743273565");
        Book b9 = new Book("The Power of Now", "Eckhart Tolle", "Spirituality, Self-help", "9781577314806");
        Book b10 = new Book("Think and Grow Rich", "Napoleon Hill", "Self-help, Success", "9780449214923");
        Book b11 = new Book("The Subtle Art of Not Giving a F*ck", "Mark Manson", "Self-help", "9780062457714");
        Book b12 = new Book("Ikigai", "Héctor García & Francesc Miralles", "Self-help, Japanese Philosophy", "9780143130727");
        Book b13 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography, Inspirational", "9788173711466");
        Book b14 = new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey", "Self-help, Personal Development", "9780743269513");
        Book b15 = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "History, Science", "9780062316097");
        Book b16 = new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "Self-help, Spirituality", "9780062515674");
        Book b17 = new Book("Life's Amazing Secrets", "Gaur Gopal Das", "Self-help, Motivational", "9780143442295");
        Book b18 = new Book("Do It Today", "Darius Foroux", "Productivity, Self-help", "9780143452126");
        Book b19 = new Book("Can't Hurt Me", "David Goggins", "Autobiography, Motivation", "9781544512280");
        Book b20 = new Book("The Psychology of Money", "Morgan Housel", "Finance, Psychology", "9789390166268");
        Book b21 = new Book("Deep Work", "Cal Newport", "Productivity, Focus", "9781455586691");
        Book b22 = new Book("Digital Minimalism", "Cal Newport", "Technology, Self-help", "9780525536512");
        Book b23 = new Book("You Can Win", "Shiv Khera", "Motivational, Self-help", "9788174765529");
        Book b24 = new Book("Zero to One", "Peter Thiel", "Entrepreneurship, Business", "9780804139298");
        Book b25 = new Book("Start With Why", "Simon Sinek", "Leadership, Motivation", "9781591846444");

        // 👇 Testing Dummy Values for User
        User u1 = new User("UID1","Saran","Student");
        User u2 = new User("UID2","Thomas","Staff");
        User u3 = new User("UID3","Shelby","Student");

        // 👇Adding Book for Dummy Values;
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        library.addBook(b6);
        library.addBook(b7);
        library.addBook(b8);
        library.addBook(b9);
        library.addBook(b10);
        library.addBook(b11);
        library.addBook(b12);
        library.addBook(b13);
        library.addBook(b14);
        library.addBook(b15);
        library.addBook(b16);
        library.addBook(b17);
        library.addBook(b18);
        library.addBook(b19);
        library.addBook(b20);
        library.addBook(b21);
        library.addBook(b22);
        library.addBook(b23);
        library.addBook(b24);
        library.addBook(b25);

        library.addUser(u1);
        library.addUser(u2);
        library.addUser(u3);
        do {
            System.out.println("\n1.Book Management\n2.User Management\n3.Search Option\n4.Exit");
            System.out.println("Enter your Choice: ");
            choice =Sc.nextInt();
            switch (choice) {
                
                case 1:
                    System.out.println("You are Enter in Book Managemnet Menu...");
                    do {
                        System.out.println("\n1.Add Book\n2.Delete Book\n3.Display Book\n4.Check Availability\n5.Borrowed List\n6.Exit");
                        System.out.println("Enter your Choice: ");
                        Bchoice = Sc.nextInt();
                        switch (Bchoice) {
                            case 1:
                                Sc.nextLine();
                                System.out.println("Your are Entering in Book Management..");
                                System.out.println("Enter Book Title:");
                                title =Sc.nextLine();
                                System.out.println("Enter Book Author:");
                                author =Sc.nextLine();
                                System.out.println("Enter Book Genre:");
                                genre =Sc.nextLine();
                                System.out.println("Enter Book ISBN:");
                                isbn =Sc.nextLine();
                                Book bk = new Book(title,author,genre,isbn);
                                library.addBook(bk);
                                break;
                            case 2:
                                Sc.nextLine();
                                System.out.println("Enter the Book Title");
                                title = Sc.nextLine();
                                library.deleteBook(title);
                                break;
                            case 3:
                                library.displayBook();
                                break;
                            case 4:
                                Sc.nextLine();
                                System.out.println("Enter the Book Title you want to Check: ");
                                title = Sc.nextLine();
                                library.availableBook(title);
                                break;
                            case 5:
                                System.out.println("Borrowed User and Book List");
                                library.displayBorrow();
                                break;
                            case 6:
                                System.out.println("Exiting for Book  Menu");
                                break;
                            default:
                                System.out.println("Invalid Input\n\nTry Again");
                                break;
                        }
                    } while (Bchoice < 6);
                    break;
                case 2:
                    System.out.println("You are Enter into User Management..");
                    do{
                        System.out.println("1.Add User\n2.Delete User\n3.Display Users\n4.Borrow Book\n5.Return Book\n6.Exit");
                        System.out.println("Enter your choice:");
                        Uchoice = Sc.nextInt();
                        switch (Uchoice) {
                            case 1:
                                Sc.nextLine();
                                System.out.println("Enter Your UserId");
                                userId = Sc.nextLine();
                                userId ="UID"+userId;
                                System.out.println("Enter your Name:");
                                name = Sc.nextLine();
                                System.out.println("Enter the UserType(Student or Staff):");
                                userType = Sc.nextLine();
                                User user = new User(userId, name, userType);
                                library.addUser(user);
                                System.out.println("Your User ID is : "+userId);
                                break;
                            case 2:
                                Sc.nextLine();
                                System.out.println("Enter the User Id want to remove:");
                                userId = Sc.nextLine();
                                library.deleteUser(userId);
                                break;
                            case 3:
                                library.displayUser();
                                break;
                            case 4:
                                Sc.nextLine();
                                System.out.println("Enter Your UserID:");
                                userId = Sc.nextLine();
                                System.out.println("Welcome "+library.getName(userId));
                                System.out.println("Enter The Book Title you want to Borrow:");
                                title = Sc.nextLine();
                                library.borrowBook(userId,title);
                                break;
                            case 5:
                                Sc.nextLine();
                                System.out.println("Enter Your UserID:");
                                userId = Sc.nextLine();
                                System.out.println("Enter The Book Title you want to Return:");
                                title = Sc.nextLine();
                                library.returnBook(userId,title);
                                System.out.println("Thank You!.. "+library.getName(userId));
                                break;
                            case 6:
                                System.out.println("Exiting for User Menu");
                                break;
                            default:
                                System.out.println("Invalid Input\nTry Again");
                                break;
                        }
                    }while(Uchoice<6);
                    break;
                case 3:
                    System.out.println("You are Enter into Search Option ...");
                    do{
                        System.out.println("1.Author\n2.Genre\n3.Title\n4.Exit");
                        Schoice = Sc.nextInt();
                        switch (Schoice) {
                            case 1:
                                Sc.nextLine();
                                System.out.println("Enter the author name that you want search :");
                                author = Sc.nextLine();
                                library.searchAuthor(author);
                                break;
                            case 2:
                                Sc.nextLine();
                                System.out.println("Enter the genre name that you want search :");
                                genre = Sc.nextLine();
                                library.searchGenre(genre);
                                break;
                            case 3:
                                Sc.nextLine();
                                System.out.println("Enter the title name that you want search :");
                                title = Sc.nextLine();
                                library.searchTitle(title);
                                break;
                            case 4:
                                System.out.println("Exiting from Search..");
                                break;
                            default:
                                break;
                        }
                    }while(Schoice<4);
                    break;
                case 4:
                    System.out.println("Exiting from Main Menu");
                    break;
                default:
                    System.out.println("Invalid Input\n Try Again");
                    break;
            }
        } while (choice < 4);
        Sc.close();
    }
}