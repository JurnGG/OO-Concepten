package Week1;

import java.util.Scanner;

public class Tafels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        while (true){
            System.out.print("Welke tafel wil je krijgen? ");
            t = scanner.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " x " + t + " = " + t * i);
            }
            System.out.print("Wenst u nog een tafel af te drukken (j/n): ");
            String answer = scanner.next();

            if (answer.equals("n")){
                break;
            }

        }
    }
}
