package Week1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vakantie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Hoeveel heeft Yousra uitgegeven? ");
        double p1 = scanner.nextDouble();
        System.out.print("hoeveel heeft Quiten uitgegeven? ");
        double p2 = scanner.nextDouble();
        System.out.println("In totaal werd er "+ df.format(p1 + p2) + " EUR uitgegeven.");

        double perPersoon = (p1 + p2) / 2;
        System.out.println("Dat is "+ df.format((p1 + p2) / 2) + " EUR per persoon.");

        boolean doesYousraOwe = p1 < p2;

        System.out.println((doesYousraOwe ? "Yousra" : "Quiten") + " moet " + df.format(doesYousraOwe ? perPersoon - p1 : perPersoon - p2 ) + " EUR betalen.");
    }
}
