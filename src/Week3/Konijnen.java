package Week3;

import java.util.Scanner;

public class Konijnen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,beginN, g1 = 1, g2 = 1;

        System.out.print("aantal maanden: ");
        n = scanner.nextInt();
        beginN = n;
        while (n > 2) {
            int temp = g1;
            g1 = g2;
            g2 += temp;
            n--;
        }
        System.out.println("Na "+beginN+" maanden zijn er "+g2+" konijnen.");
    }
}