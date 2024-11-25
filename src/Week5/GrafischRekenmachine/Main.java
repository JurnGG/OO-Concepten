package Week5.GrafischRekenmachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int typeCurve;

        do {
            System.out.print("Enter the minimum x value: ");
            double minXValue = scanner.nextDouble();
            System.out.print("Enter the maximum x value: ");
            double maxXValue = scanner.nextDouble();
            System.out.print("Enter the type of curve (1 for sinus, 2 for cosinus hyberbolicus, 3 for wortel): ");
            typeCurve = scanner.nextInt();
            if(typeCurve >= 1 && typeCurve <= 3) {
                Calculator calculator = new Calculator(minXValue, maxXValue, TypeCurve.values()[typeCurve - 1]);
                calculator.calculate();
            }
        }while (typeCurve >= 1 && typeCurve <= 3);
    }
}
