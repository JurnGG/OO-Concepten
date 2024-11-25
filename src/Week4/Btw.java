package Week4;

public class Btw {
    private int percentage;

    public Btw(int percentage){
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public double addBtw(double price){
        return price * (1 + this.percentage / 100.0);
    }

    public double removeBtw(double price){
        return price / (1 + this.percentage / 100.0);
    }
}
