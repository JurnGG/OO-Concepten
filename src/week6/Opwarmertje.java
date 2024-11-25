package week6;

import java.util.Scanner;

public class Opwarmertje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_temperatures = 3; //change to 7 for other assignment
        double[] temperature = new double[number_of_temperatures];

        inputTemperature(scanner, temperature, number_of_temperatures);
        printTemperature(temperature, number_of_temperatures);

    }

    public static void inputTemperature(Scanner scanner, double[] temperature, int number) {
        System.out.println("geef de 7 temperaturen in: ");
        for (int i = 0; i < number; i++) {
            System.out.print("dag " + (i + 1) + ": ");
           temperature[i] = scanner.nextDouble();
        }
    }

    public static void printTemperature(double[] temperature, int number) {
        System.out.println("Overzicht: " +
                "\n=============");
        for (int i = 0; i < number; i++) {
            System.out.printf("dag " + (i + 1) + ": %5.2f°\n", temperature[i]);
        }
        System.out.println("=============");
        System.out.printf("Gemiddlede temperatuur: %5.2f°\n", calculateAverage(temperature));
    }

    public static double calculateAverage(double[] temperature) {
        double sum = 0;
        for (double temp : temperature) {
            sum += temp;
        }
        return sum / temperature.length;
    }
}
