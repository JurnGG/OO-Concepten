package week6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Temperatuur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] temps = new Double[7];
        int j = 1;

        for (int i = 0; i < 7; i++) {
            System.out.print("geef de temperatuur van dag "+(i+1)+": ");
            temps[i] = scanner.nextDouble();
        }

        for (double temp : temps) {
            System.out.printf("dag " + j+ ": %5.2f°\n", temp);
            j++;
        }

        System.out.printf("minimum temperatuur: %5.2f°\n", Collections.min(Arrays.stream(temps).toList()));
        System.out.printf("maximum temperatuur: %5.2f°\n", Collections.max(Arrays.stream(temps).toList()));
        System.out.printf("gemiddelde temperatuur: %5.2f°\n", average(temps));
    }

    public static Double average(Double[] numbers){
        double sum = 0;
        if(numbers.length == 0){
            return null;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
