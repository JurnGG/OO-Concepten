package week6.kaartspelletjes.uitbreiding;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n;
        int[] suits = {0,1,2,3};
        int[] values = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        Card card = new Card(suits, values);

        do{
            System.out.print("Hoeveel kaarten wil je trekken?(-1 om te stoppen): ");
            n = scanner.nextInt();
            if(n > 0){
                card.createCards(n,random);
                System.out.println();
            }

        }while (n > 0);

    }
}
