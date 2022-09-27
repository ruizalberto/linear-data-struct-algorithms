public class TestBook {
    public static void main(String[] args) {
        System.out.println("-----");
        System.out.println("Book Test");
        Book book = new Book();
        book.setAuthor("alberto");
        book.setTitle("Title Test");
        book.setYearOfPublication("2022");
        System.out.println(book.toString());

        System.out.println();

        System.out.println("-----");
        System.out.println("Print Book Test");
        PrintBook printBook = new PrintBook();
        printBook.setPublisher("Hiii");
        printBook.setISBN("sdfs");
        printBook.setAuthor("alberto");
        printBook.setTitle("alberto Title");
        printBook.setYearOfPublication("2022");
        System.out.println(printBook.toString());

        System.out.println();

        System.out.println("-----");
        System.out.println("Audio Book Test");
        AudioBook audioBook = new AudioBook();
        audioBook.setAuthor("alberto autor");
        audioBook.setTitle("2000 title");
        audioBook.setYearOfPublication("2000");
        audioBook.setPlayLength("2 min");
        audioBook.setPlaybackName("alberto");
        audioBook.setSizeBook("5 MB");
        System.out.println(audioBook.toString());
    }
}
