public class Book {
    String title;
    String yearOfPublication;
    String author;

    public Book(){
        this.title = "";
        this.author = "";
        this.yearOfPublication = "";
    }

    @Override
    public String toString() {
        return this.title + " was made by " + this.author + " on " + this.yearOfPublication;
    }
}
