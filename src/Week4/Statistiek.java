package Week4;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Statistiek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //version with ints
        //IntSummaryStatistics stats = new IntSummaryStatistics();
        //int g1;
        DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
        double g1;

        do {
            System.out.print("Geef een getal (-1 = stop): ");
            //g1 = scanner.nextInt();
            g1 = scanner.nextDouble();

            if(g1 != -1){
                stats.accept(g1);
            }

        }while (g1 != -1);

        System.out.println("Je gaf "+stats.getCount()+" getallen in.");
        System.out.printf("Het gemiddelen is: %.2f%n", stats.getAverage());
    }
}
