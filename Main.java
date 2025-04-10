import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        //👇 Variables
        //Book Management
        String id,title,author,genre,isbn;
        boolean isAvailable;

        //👇 Object
        Library library = new Library();
        // Book book = new Book();

        // 👇 Testing Dummy Values;
        Book b1 = new Book("B001", "The Alchemist", "Paulo Coelho", "Adventure, Fantasy", "9780061122415");
        Book b2 = new Book("B002", "Harry Potter", "J.K. Rowling", "Fantasy", "9780590353403");
        Book b3 = new Book("B003", "Atomic Habits", "James Clear", "Self-help", "9780735211292");
        Book b4 = new Book("B004", "The Da Vinci Code", "Dan Brown", "Mystery, Thriller", "9780385504208");
        //Book b5 = new Book("B005", "Rich Dad Poor Dad", "Robert T. Kiyosaki", "Personal Finance", "9781612680194");
        Book b5 = new Book("B006", "To Kill a Mockingbird", "Harper Lee", "Fiction", "9780061120084");


        // Adding Book for Dummy Values;
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);


        int choice;
        do {
            System.out.println("\n1.Add Book\n2.Delete Book\n3.Display Book\n4.Check Availability\n5.Exit");
            System.out.println("Enter your Choice: ");
            choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    Sc.nextLine();
                    System.out.println("Your are Entering in Book Management..");
                    System.out.println("Enter Book Id:");
                    id=Sc.nextLine();
                    System.out.println("Enter Book Title:");
                    title =Sc.nextLine();
                    System.out.println("Enter Book Author:");
                    author =Sc.nextLine();
                    System.out.println("Enter Book Genre:");
                    genre =Sc.nextLine();
                    System.out.println("Enter Book ISBN:");
                    isbn =Sc.nextLine();
                    Book bk = new Book(id,title,author,genre,isbn);
                    library.addBook(bk);
                break;
                case 2:
                Sc.nextLine();
                System.out.println("Enter the Book Id");
                id = Sc.nextLine();
                library.deleteBook(id);
                break;
                case 3:
                    library.displayBook();
                break;
                case 4:
                    Sc.nextLine();
                    System.out.println("Enter the Book Id you want to Check: ");
                    id = Sc.nextLine();
                    library.availableBook(id);
                break;
                case 5:
                    System.out.println("Exiting for Main Menu");
                break;
                default:
                    System.out.println("Invalid Input\n\nTry Again");
                break;
            }
        } while (choice <5);
        Sc.close();
    }
}