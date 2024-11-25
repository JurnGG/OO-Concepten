package week7;

import java.time.LocalDate;
import java.util.Scanner;

public class Bioritme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef je geboortedag: ");
        int dag = scanner.nextInt();
        System.out.print("Geef je geboortemaand: ");
        int maand = scanner.nextInt();
        System.out.print("Geef je geboortejaar: ");
        int jaar = scanner.nextInt();
        LocalDate gbd = LocalDate.of(jaar, maand, dag);
        double dysOld = (double) (LocalDate.now().toEpochDay() - gbd.toEpochDay());

        System.out.println("\nJe bent " + dysOld + " dagen oud.");

        double fysical = Math.abs(Math.sin(dysOld / 23 * 2 * Math.PI));
        double emotional = Math.abs(Math.sin(dysOld / 28 * 2 * Math.PI));
        double intellectual = Math.abs(Math.sin(dysOld / 33 * 2 * Math.PI));
        System.out.println("Fysical: " + getCondition(fysical));
        System.out.println("Emotional: " + getCondition(emotional));
        System.out.println("Intellectual: " + getCondition(intellectual));
    }

    private static String getCondition(double value) {
        if (value >= 0 && value < 0.2) {
            return "kritieke waarde";
        } else if (value >= 0.2 && value < 0.5) {
            return "ok";
        } else if (value >= 0.5 && value < 0.8) {
            return "goed";
        } else {
            return "topconditie";
        }
    }
}
