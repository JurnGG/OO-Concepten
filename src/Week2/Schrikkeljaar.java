package Week2;

import java.util.Scanner;

public class Schrikkeljaar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een jaartal: ");
        int jaar = scanner.nextInt();

        if(jaar % 100 == 0 && jaar % 400 == 0) {
            System.out.println(jaar + " is een schrikkeljaar.");
            return;
        }

        if (jaar % 4 == 0 && jaar % 100 != 0) {
            System.out.println(jaar + " is een schrikkeljaar.");
            return;
        }

        System.out.println(jaar + " is geen schrikkeljaar.");
    }
}
