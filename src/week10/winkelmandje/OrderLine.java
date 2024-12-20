package week10.winkelmandje;

public class OrderLine {
    private Item item;
    private int amount;

    public OrderLine(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount += amount;
    }

    @Override
    public String toString() {
        return String.format("%-40s %6d %8.2f EUR",
                item.toString(),
                amount,
                amount * item.getPrice());
    }
}
