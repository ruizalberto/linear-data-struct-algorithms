public class PrintBook extends Book{
    String publisher;
    String ISBN;

    @Override
    public String toString() {
        return super.toString() + ". The publisher is " + this.publisher + " and the ISBN is " + this.ISBN;
    }
}
