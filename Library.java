import java.util.*;
class Library{
    private Map<String,Book> books = new TreeMap<>();
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
}