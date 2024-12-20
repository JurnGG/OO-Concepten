package week11.winkelmandje;

import java.util.ArrayList;
import java.util.List;

public class Book extends Item {
    private String title;
    private List<String> authors;

    public Book(String id, Double price, String title, String author) {
        super(id, price);
        this.title = title;
        authors = new ArrayList<>();
        authors.add(author);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    @Override
    public String toString() {
        return String.format("%-7s '%-7s'   (%s)", id, title, String.join(", ", authors));
    }
}
