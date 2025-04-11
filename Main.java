import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        //👇 Variables
        int choice,Bchoice,Uchoice;

        // 👇Book Management
        String title,author,genre,isbn;

        // 👇 User
        String userId,name,userType;

        //👇 Object
        Library library = new Library();
        User userObj = new User();

        // 👇 Testing Dummy Values for Book
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "Adventure, Fantasy", "9780061122415");
        Book b2 = new Book("Harry Potter", "J.K. Rowling", "Fantasy", "9780590353403");
        Book b3 = new Book("Atomic Habits", "James Clear", "Self-help", "9780735211292");
        Book b4 = new Book("The Da Vinci Code", "Dan Brown", "Mystery, Thriller", "9780385504208");
        //Book b5 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", "Personal Finance", "9781612680194");
        Book b5 = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "9780061120084");
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
        library.addUser(u1);
        library.addUser(u2);
        library.addUser(u3);
        do {
            System.out.println("\n1.Book Management\n2.User Management\n3.Exit");
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
                                System.out.println("Welcome "+userObj.getName());
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
                                System.out.println("Thank You!.. "+userObj.getName());
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
                    System.out.println("Exiting from Main Menu");
                    break;
                default:
                    System.out.println("Invalid Input\n Try Again");
                    break;
            }
        } while (choice < 3);
        Sc.close();
    }
}