package Week5.Library;

public class Book {
    private String author;
    private String title;
    private int numberOfPages;
    private boolean borrowed;

    public Book(String author, String title, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.borrowed = false;
    }

    public Book(){
        this.author = "Unknown";
        this.title = "Unknown";
        this.numberOfPages = 0;
        this.borrowed = false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void printDetails(){
        System.out.println("Het boek " + title.toUpperCase() + " " + numberOfPages + ", geschreven door " + author.toUpperCase() + " is momenteel " + (borrowed ? "uitgeleend." : "niet uitgeleend."));
    }

}
