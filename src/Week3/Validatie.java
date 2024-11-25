package Week3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Validatie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, result=0;

        for (int i = 1; i <= 5; i++) {
            do {
                System.out.print("Geef het " + i + "e getal in: ");
                n = scanner.nextInt();
            } while (!readNumber(n));
            result += n;
        }


        System.out.println("Het gemiddelde van de getallen is: " + (double) result / 5);

    }
    public static boolean readNumber(int n){
        if(n < 0){
            System.out.println("Het getal moet positief zijn.");
            return false;
        }

        if(n > 100){
            System.out.println("Het getal mag niet groter zijn dan 100.");
            return false;
        }

        if(n > 50 && n % 2 != 0){
            System.out.println("Een getal groter dan 50 moet deelbaar zijn door 2.");
            return false;
        }

        return true;
    }
}
