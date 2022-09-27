public class AudioBook extends Book {
    String sizeBook;
    String playLength;
    String playbackName;

    public AudioBook(){
        super();
        this.sizeBook = "";
        this.playLength = "";
        this.playbackName = "";
    }

    @Override
    public String toString() {
        return super.toString() + " with a size of " + this.sizeBook + 
        ", a play length of " + this.playLength + " and a playback artist's name of " + this.playbackName;
    }
}
