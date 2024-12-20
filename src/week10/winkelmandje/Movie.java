package week10.winkelmandje;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Item{
    private String title;
    private List<String> actors;

    public Movie(String id, Double price, String title, String actor) {
        super(id, price);
        this.title = title;
        actors = new ArrayList<>();
        actors.add(actor);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getActors() {
        return actors;
    }
    public void addActor(String actor) {
        actors.add(actor);
    }


    @Override
    public String toString() {
        return String.format("%-7s '%-7s'   (%s)", id, title, String.join(", ", actors));
    }
}
