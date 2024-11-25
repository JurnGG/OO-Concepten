package week6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Woordlengtes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aantal, i = 0;

        System.out.print("hoeveel woorden gaat u ingeven: ");
        aantal = scanner.nextInt();
        String[] woorden = new String[aantal];

        while (i < aantal) {
            System.out.print("woord "+(i+1)+": ");
            woorden[i] = scanner.next();
            i++;
        }

        System.out.println("korste woord: " + Collections.min(Arrays.asList(woorden), Comparator.comparingInt(String::length)));
        System.out.println("langste woord: " + Collections.max(Arrays.asList(woorden), Comparator.comparingInt(String::length)));
    }
}
