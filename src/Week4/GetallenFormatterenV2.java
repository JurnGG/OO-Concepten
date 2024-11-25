package Week4;

import java.util.Scanner;

public class GetallenFormatterenV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een getal in: ");
        double g = scanner.nextDouble();

        System.out.print(formatNumber(g));
    }

    public static String formatNumber(double number) {
        // Split number into integer and decimal parts
        String[] parts = String.format("%.2f", number).split(",");
        String integerPart = parts[0];
        String decimalPart = parts.length > 1 ? parts[1] : "";

        StringBuilder formattedNumber = new StringBuilder();
        int j = 0;

        for (int i = integerPart.length() - 1; i >= 0; i--) {
            formattedNumber.append(integerPart.charAt(i));
            j++;
            if (j % 3 == 0 && i != 0) {
                formattedNumber.append(" ");
            }
        }


      return formattedNumber.reverse().append(","+decimalPart).toString();
    }
}
