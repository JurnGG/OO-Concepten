package week6.film;

public class MovieCollection {
    private int MAX_SIZE;
    private Movie[] movies;
    private int index;
    private boolean isFull;

    public MovieCollection() {
        MAX_SIZE = 20; // 9 for exercise 1
        movies = new Movie[MAX_SIZE];
        isFull = false;
        index = 0;
    }

    public int getMAX_SIZE() {
        return MAX_SIZE;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public int getIndex() {
        return index;
    }

    public boolean isFull() {
        return isFull;
    }

    public void addMovie(Movie movie) {
        if(isFull) {
            System.out.println("Movie collection is full");
            return;
        }

        if(index == MAX_SIZE) {
            isFull = true;
            return;
        }

        movies[index] = movie;
        index++;
    }
}

