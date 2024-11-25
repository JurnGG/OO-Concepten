package Week1;

import java.util.Scanner;

public class VakantieV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoeveel heeft Cedric uitgegeven? ");
        double p1 = scanner.nextDouble();
        System.out.print("Hoeveel heeft Xander uitgegeven? ");
        double p2 = scanner.nextDouble();
        System.out.print("Hoeveel heeft Jurn uitgegeven? ");
        double p3 = scanner.nextDouble();

        double perPerson = calculatePerPerson(p1, p2, p3);

        double d1 = p1 - perPerson;
        double d2 = p2 - perPerson;
        double d3 = p3 - perPerson;

        System.out.printf("Per persoon moet er %.2f EUR betaald worden.\n", perPerson);


        if (d1 < 0) {
            System.out.printf("Cedric should pay %.2f EUR\n", Math.abs(d1));
        } else {
            System.out.printf("Cedric should receive %.2f EUR\n", d1);
        }

        if (d2 < 0) {
            System.out.printf("Xander should pay %.2f EUR\n", Math.abs(d2));
        } else {
            System.out.printf("Xander should receive %.2f EUR\n", d2);
        }

        if (d3 < 0) {
            System.out.printf("Jurn should pay %.2f EUR\n", Math.abs(d3));
        } else {
            System.out.printf("Jurn should receive %.2f EUR\n", d3);
        }
    }

    public static double calculatePerPerson(double p1, double p2, double p3) {
        return (p1 + p2 + p3) / 3;
    }
}
