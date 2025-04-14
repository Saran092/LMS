public class Book {
    private String title,author,genre,isbn;
    private boolean isAvailable = true;

    Book(String title,String author,String genre,String isbn){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }
    //👇 Getters

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
    
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-30s%-30s%-20s",title,author,genre,isbn);
    }
}
