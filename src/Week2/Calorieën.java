package Week2;

import java.util.Scanner;

public class Calorieën {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String land;
        int inwoners= 0 , minimumInwoners = 1000000, gemiddeldeCalorieën = 2256, calorieenInPizza = 906;

        System.out.print("geef een land: ");
        land = scanner.nextLine();
        while (inwoners < minimumInwoners) {
            System.out.print("Hoeveel mensen wonen in het land: ");
            inwoners = scanner.nextInt();
            if (inwoners < minimumInwoners) {
                System.out.println("Het land moet minstens 1.000.000 inwoners hebben");
            }
        }

        long totaalCalorieën = (long) inwoners * gemiddeldeCalorieën;
        long totalePizza = totaalCalorieën / calorieenInPizza;

        System.out.println("In "+land+" verbruiken alle inwoners samen "+totaalCalorieën+" calorieën per dag.");
        System.out.println("Dat komt overeen met "+totalePizza+" pizza's per dag.");



    }
}
