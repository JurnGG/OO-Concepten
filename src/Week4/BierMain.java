package Week4;

public class BierMain {
    public static void main(String[] args) {
        BierVat v1 = new BierVat(15, 0);

        v1.fillFull();
        System.out.println(v1.isFull()? "Vat 1 is vol": "Vat 1 is niet vol");
        System.out.println("Percentage = "+v1.percentageFilled());

        v1.tap(3.75);

        System.out.println(v1.isFull()? "Vat 1 is vol": "Vat 1 is niet vol");
        System.out.println("Percentage = "+v1.percentageFilled());




    }
}
