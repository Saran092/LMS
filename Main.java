import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        //👇 Variables
        int choice,Achoice,Uchoice,Schoice;

        // 👇Book Management
        String title,author,genre,isbn;
        String admin,password;

        // 👇 User
        String userId,name,userType,nam;

        //👇 Object
        Library library = new Library();
        do {
            System.out.println("\n1.Admin Panel\n2.User Panel\n3.Exit");
            System.out.println("Enter your Choice: ");
            choice =Sc.nextInt();
            switch (choice) {
                
                case 1:
                    Sc.nextLine();
                    System.out.println("You are enter into  Admin Panel...");
                    System.out.println("Enter the admin user Name :");
                    admin = Sc.nextLine();
                    System.out.println("Enter the admin Password :");
                    password = Sc.nextLine();
                    if(admin.equalsIgnoreCase(library.getAdmin()) && password.equals(library.getPassword())){
                        do {
                            System.out.println("\n1.Add Book\n2.Delete Book\n3.Display Book\n4.Check Availability\n5.Add User\n6.Delete User\n7.Display Users\n8.Borrowed List\n9.Reservation User List\n10.Exit");
                            System.out.println("Enter your Choice: ");
                            Achoice = Sc.nextInt();
                            switch (Achoice) {
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
                                    Sc.nextLine();
                                    System.out.println("Enter Your UserId");
                                    userId = Sc.nextLine();
                                    System.out.println("Enter your Name:");
                                    name = Sc.nextLine();
                                    System.out.println("Enter the UserType(Student or Staff):");
                                    userType = Sc.nextLine();
                                    User user = new User(userId, name, userType);
                                    library.addUser(user);
                                    System.out.println("Your User ID is : "+userId);
                                    break;
                                case 6:
                                    Sc.nextLine();
                                    System.out.println("Enter the User Id want to remove:");
                                    userId = Sc.nextLine();
                                    library.deleteUser(userId);
                                    break;
                                case 7:
                                    library.displayUser();
                                    break;
                                case 8:
                                    library.displayBorrow();
                                    break;
                                case 9:
                                    library.displayReservation();
                                    break;
                                case 10:
                                    System.out.println("Exiting for Admin Panel");
                                    break;
                                default:
                                    System.out.println("Invalid Input\n\nTry Again");
                                    break;
                            }
                        } while (Achoice < 10);
                    }
                    else
                        System.out.println("Please Enter the Correct UserName and Password..");
                    break;
                case 2:
                    System.out.println("You are Enter into User Panel..");
                    Sc.nextLine();
                    System.out.println("Enter Your UserID:");
                    userId = Sc.nextLine();
                    try{
                        nam = library.getName(userId);
                        System.out.println("Welcome "+nam+" :-)");
                        do{
                            System.out.println("\n1.Borrow Book\n2.Return Book\n3.Search Book\n4.Exit");
                            System.out.println("Enter your choice:");
                            Uchoice = Sc.nextInt();
                            switch (Uchoice) {
                                case 1:
                                    Sc.nextLine();
                                    System.out.println("Enter The Book Title you want to Borrow:");
                                    title = Sc.nextLine();
                                    library.borrowBook(userId,title);
                                    break;
                                case 2:
                                    Sc.nextLine();
                                    System.out.println("Enter The Book Title you want to Return:");
                                    title = Sc.nextLine();
                                    library.returnBook(userId,title);
                                    System.out.println("Thank You!.. "+library.getName(userId));
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
                                    System.out.println("Exiting for User Panel");
                                    break;
                                default:
                                    System.out.println("Invalid Input\nTry Again");
                                    break;
                            }
                        }while(Uchoice<4);
                    }
                    catch(Exception e)
                    {
                        System.out.println("User not found :-(");
                    }
                    
                    break;
                case 3:
                    System.out.println("Exiting from Library");
                    break;
                default:
                    System.out.println("Invalid Input\n Try Again");
                    break;
            }
        } while (choice < 3);
        Sc.close();
    }
}