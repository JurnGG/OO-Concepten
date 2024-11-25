package Week1;

import java.util.Scanner;

public class Bewerkingen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een getal: ");
        int n1 = scanner.nextInt();
        System.out.print("Geef nog een getal: ");
        int n2 = scanner.nextInt();
        System.out.println("kies een bewerking:");
        System.out.println("1. optellen");
        System.out.println("2. aftrekken");
        System.out.println("3. vermenigvuldigen");
        System.out.println("4. delen");
        System.out.print("Jouw keuze: ");
        int keuze = scanner.nextInt();
        switch (keuze) {
            case 1 -> System.out.println(n1+ " + " + n2 + " = " + (n1 + n2));
            case 2 -> System.out.println(n1+ " - " + n2 + " = " + (n1 - n2));
            case 3 -> System.out.println(n1+ " * " + n2 + " = " + (n1 * n2));
            case 4 -> {
                if (n2 == 0) {
                    System.out.println("Delen door nul is niet mogelijk");
                } else {
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                }
                break;

            }
            default -> System.out.println("Ongeldige keuze");
        }
    }
}
