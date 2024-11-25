package Week1;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een getal: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Geef nog een getal: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Geef een laatste getal: ");
        int thirdNumber = scanner.nextInt();

        int product = firstNumber * secondNumber * thirdNumber;
        System.out.println("Het product is: " + product);
    }
}