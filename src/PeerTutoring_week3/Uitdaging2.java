package PeerTutoring_week3;

import java.util.Scanner;

public class Uitdaging2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de te converteren eenheid: ");
        String convertFrom = scanner.nextLine();
        System.out.print("Geef de eenheid naar waar geconverteerd wordt: ");
        String convertTo = scanner.nextLine();
        System.out.print("Geef de waarde van a: ");
        double a = scanner.nextDouble();
        System.out.print("Geef de waarde van b: ");
        double b = scanner.nextDouble();
        System.out.print("Geef de startwaarde in "+ convertFrom+": ");
        int start = scanner.nextInt();
        System.out.print("Geef de eindwaarde in "+ convertFrom+": ");
        int end = scanner.nextInt();
        System.out.print("Geef de stapwaarde: ");
        int step = scanner.nextInt();

        int length = convertTo.length() + convertFrom.length() + 10;

        System.out.println("=".repeat(length));
        System.out.printf("| %2s | %4s |%n",convertFrom, convertTo);
        System.out.println("-".repeat(length));

        for (int i= start; i <= end; i += step) {

            System.out.printf("| %2s = %5s | \n",i , ((double) (a * i + b)));
        }
        System.out.println("=".repeat(length));
    }
}
