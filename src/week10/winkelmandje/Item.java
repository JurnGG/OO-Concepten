package week10.winkelmandje;

public abstract class Item {
    protected String id;
    protected Double price;

    public Item(String id, Double price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }
}
