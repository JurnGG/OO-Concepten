package Week5.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("J.K. Rowling", "Harry Potter and the Philosopher's Stone", 223);
        Book book2 = new Book("J.R.R. Tolkien", "The Hobbit", 310);
        Book book3 = new Book("George R.R. Martin", "A Game of Thrones", 694);
        Book book4 = new Book("Stephen King", "The Shining", 447);
        Book book5 = new Book("J.K. Rowling", "Harry Potter and the Chamber of Secrets", 251);
        Book unknownBook = new Book();

        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
        book4.printDetails();
        book5.printDetails();
        unknownBook.printDetails();
    }
}
