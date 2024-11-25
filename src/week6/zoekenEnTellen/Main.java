package week6.zoekenEnTellen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int[] table = {16, 14, 19, 18, 4, 10, 2, 3, 12, 17, 14,
                12, 4, 10, 10, 16, 12, 10, 12, 20};
        Number numbers = new Number(table);

        System.out.println(numbers);

        System.out.println("\nNumber 12 occurs " + numbers.numberOfTimes(12) + " times.");
        System.out.println("Number 20 occurs " + numbers.numberOfTimes(20) + " times.");
        System.out.println("Number 13 occurs " + numbers.numberOfTimes(13) + " times.");

        do {
            System.out.print("which number do you want to search for? (quit with -1): ");
            number = scanner.nextInt();
            if (number >= 0) {
                System.out.printf("Het getal %d komt %svoor in de tabel%n", number, (numbers.isPresent(number)?"":"NIET "));
            }
        } while (number >= 0);
    }
}
