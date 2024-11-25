package Week3;

import java.util.Scanner;

public class Kerstboom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breedte;

        do{
        System.out.print("Geef de breedte van de kerstboom (oneven getal in bereik 13..29): ");
        breedte = scanner.nextInt();
        }while (breedte < 13 || breedte > 29 || breedte % 2 == 0);

        for(int i = 1; i <= breedte; i+=2){
            System.out.println(" ".repeat((breedte - i) / 2) + "*".repeat(i));
        }
        for(int i = 1; i <= 3; i++){
            System.out.println(" ".repeat((breedte - 3) / 2) + "***");
        }


    }
}
