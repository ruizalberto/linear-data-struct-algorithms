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

class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("alberto");
        book.setTitle("Title Test");
        book.setYearOfPublication("2022");

        System.out.println(book.toString());

        PrintBook printBook = new PrintBook();
        printBook.setPublisher("Hiii");
        printBook.setISBN("sdfs");
        printBook.setAuthor("alberto");
        printBook.setTitle("alberto Title");
        printBook.setYearOfPublication("2022");

        System.out.println(book.toString());
    }
}