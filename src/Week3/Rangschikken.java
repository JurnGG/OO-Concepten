package Week3;

import java.util.Scanner;

public class Rangschikken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hoeveel voorwerpen: ");
        int n = scanner.nextInt();
        System.out.println("je kan " + n + " voorwerpen op " + calculateFactorial(n)+ " manieren rangschikken");

    }
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
