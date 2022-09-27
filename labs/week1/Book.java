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

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }
}

class PrintBook extends Book {
    String publisher;
    String ISBN;

    public PrintBook() {
        super();
        this.publisher = "";
        this.ISBN = "";
    }

    public void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return super.toString() + ". Publisher's name " + getPublisher() + ". ISBN: " + getISBN();
    }

}

class AudioBook extends Book {
    String sizeBook;
    String playLength;
    String playbackName;

    public AudioBook(){
        super();
        this.sizeBook = "";
        this.playLength = "";
        this.playbackName = "";
    }

    public String getPlayLength() {
        return playLength;
    }

    public String getPlaybackName() {
        return playbackName;
    }
    
    public String getSizeBook() {
        return sizeBook;
    }

    public void setPlayLength(String playLength) {
        this.playLength = playLength;
    }

    public void setPlaybackName(String playbackName) {
        this.playbackName = playbackName;
    }

    public void setSizeBook(String sizeBook) {
        this.sizeBook = sizeBook;
    }

    @Override
    public String toString() {
        return super.toString() + " with a size of " + getSizeBook() + 
        ", a play length of " + getPlayLength() +
        " and a playback artist's name of " + getPlaybackName();
    }
}