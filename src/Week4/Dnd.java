package Week4;

import java.util.Scanner;

public class Dnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoeveel zijden: ");
        int z = scanner.nextInt();
        scanner.nextLine();

        Dobbelsteen d = new Dobbelsteen(z);

        for (int i = 0; i < 5; i++) {
            System.out.print("Druk op <enter> om een waarde te creëren");
            scanner.nextLine();
            System.out.println(d.gooi());
        }
        System.out.println("Klaar");
    }
}
