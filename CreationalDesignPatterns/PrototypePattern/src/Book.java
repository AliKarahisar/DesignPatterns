public class Book implements Cloneable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Getter ve setter metodları burada yer alır.
}