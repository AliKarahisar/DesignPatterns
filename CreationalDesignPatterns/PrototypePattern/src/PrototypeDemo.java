public class PrototypeDemo {
    public static void main(String[] args) {
        Book originalBook = new Book("Effective Java", "Joshua Bloch");
        try {
            Book clonedBook = (Book) originalBook.clone();
            System.out.println(clonedBook.getTitle() + " by " + clonedBook.getAuthor());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}