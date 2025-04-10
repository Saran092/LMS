public class Book {
    private String id,title,author,genre,isbn;
    private boolean isAvailable = true;

    Book(String id,String title,String author,String genre,String isbn){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }
    public String getId()
    {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean getisAvailable() {
        return isAvailable;
    }
    // Book(){};
    @Override
    public String toString() {
        return String.format("%-20s%-30s%-20s%-20s%-20s",id,title,author,genre,isbn,isAvailable);
    }
}
