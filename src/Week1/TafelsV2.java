package Week1;

import java.util.Scanner;

public class TafelsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, aantalFout = 0;
        while (true){
            System.out.print("Welke tafel wil je krijgen? ");
            t = scanner.nextInt();
            for (int i = 0; i <= 10; i++) {
                while (true) {
                    System.out.print(i + " x " + t + " = ");
                    int answer = scanner.nextInt();
                    if (answer == t * i){
                        System.out.println("Correct!");
                        break;
                    }
                    aantalFout++;
                    System.out.println("Fout!");
                }
            }
            //score systeem
            System.out.println("Je maakte "+aantalFout+" fouten op de tafel van "+t);

            System.out.print("Wenst u nog een tafel af te drukken (j/n): ");
            String answer = scanner.next();

            if (answer.equals("n")){
                break;
            }

        }
    }
}
