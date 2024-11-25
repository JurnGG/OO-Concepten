package Week4;

public class BtwMain {
    public static void main(String[] args) {
        Btw btw = new Btw(6);
        double bedrag = btw.addBtw(100);

        System.out.println("Het bedrag met BTW is: " + bedrag);
        bedrag = btw.removeBtw(106);
        System.out.println("Het bedrag zonder BTW is: " + bedrag);
    }
}
