package Week1;

import java.util.Scanner;

public class BMIV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double w = scanner.nextDouble();
        System.out.print("Enter your height in cm: ");
        double h = scanner.nextDouble();
        double bmi = w / Math.pow((h / 100), 2);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18) {
            System.out.println("Je hebt ondergewicht.");
        } else if (bmi < 25) {
            System.out.println("Je hebt een normaal gewicht.");
        } else if (bmi < 30) {
            System.out.println("Je hebt overgewicht.");
        } else {
            System.out.println("Je hebt obesitas.");
        }

    }
}
