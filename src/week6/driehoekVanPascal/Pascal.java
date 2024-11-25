package week6.driehoekVanPascal;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;

        do {
            System.out.print("Geef de aantal rijen: ");
            rows = scanner.nextInt();
            if(rows > 0){
                calcultePascal(rows);
            }

        }while (rows > 0);
    }

    public static void calcultePascal(int rows){
        if(rows > 12){
            rows = 12;
        }

        for (int i = 1; i <= rows; i++) {
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
                System.out.print(number);
                number = number * (i - j) / j;
            }
            System.out.println();
        }

    }
}
