package Week2;

import java.util.Scanner;

public class Investering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double investering, rentevoet,eindbedrag;
        int jaren;
        char valuta;

        System.out.print("geef de initiële investering: ");
        investering = scanner.nextDouble();
        System.out.print("geef de rentevoet: ");
        rentevoet = scanner.nextDouble();
        System.out.print("geef het aantal jaren: ");
        jaren = scanner.nextInt();
        System.out.print("geef de valuta: ");
        valuta = scanner.next().charAt(0);


        eindbedrag = investering * Math.pow(1 + rentevoet / 100, jaren);
        System.out.printf("Het eindbedrag bedraagt %.2f %c\n", eindbedrag, valuta);
    }
}
