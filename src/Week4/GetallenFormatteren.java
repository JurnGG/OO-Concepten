package Week4;

import java.util.Scanner;

public class GetallenFormatteren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een getal in: ");
        int g = scanner.nextInt();

        System.out.print(formatNumber(g));
    }

    public static String formatNumber(int number) {
        StringBuilder formattedNumber = new StringBuilder();
        String numberString = "" + number;
        int j = 1;

        for (int i = numberString.length()-1 ; i >= 0; i--) {
            if(j % 3 == 0 && i != 0) {
                formattedNumber.append(numberString.charAt(i));
                formattedNumber.append(" ");
            } else {
                formattedNumber.append(numberString.charAt(i));
            }
            j++;
        }

        return formattedNumber.reverse().toString();
    }
}
