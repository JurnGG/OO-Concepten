package Week3;

import java.util.Scanner;

public class Sinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de amplitude: ");
        int amplitude = scanner.nextInt();
        System.out.print("Geef de periode: ");
        int periode = scanner.nextInt();

        for (int i = 0; i <= periode * 2; i++) {
        int positie = (int)(Math.sin(i * 2 * Math.PI / periode) * amplitude + amplitude);
            System.out.println(" ".repeat(positie) + "*");
        }
    }
}
