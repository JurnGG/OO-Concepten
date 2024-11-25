package Week3;

import java.util.Random;

public class Dobbelsteen {
    public static void main(String[] args) {
        Random random = new Random();
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

        for (int i = 0; i < 6000; i++) {
            switch (rollDice(random)) {
                case 1 -> {
                    n1++;
                    break;
                }
                case 2 -> {
                    n2++;
                    break;
                }
                case 3 -> {
                    n3++;
                    break;
                }
                case 4 -> {
                    n4++;
                    break;
                }
                case 5 -> {
                    n5++;
                    break;
                }
                case 6 -> {
                    n6++;
                    break;
                }
            }
        }

        for (int i = 1; i <= 6; i++) {
            System.out.printf("Aantal keer %d: %d%n", i, switch (i) {
                case 1 -> n1;
                case 2 -> n2;
                case 3 -> n3;
                case 4 -> n4;
                case 5 -> n5;
                case 6 -> n6;
                default -> 0;
            });
        }
    }
    public static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
}
