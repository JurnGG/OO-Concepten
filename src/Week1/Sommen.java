package Week1;

import java.util.Scanner;

public class Sommen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.print("geef een getal (stopt met null): ");
            int n = scanner.nextInt();
            total += n;

            if (n == 0) {
                break;
            }
        }
        System.out.println("De som van deze getallen is: " + total);
        System.out.println("Einde programma!");

    }
}
