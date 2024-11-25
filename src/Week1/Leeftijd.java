package Week1;

import java.time.LocalDate;

import java.util.Scanner;

public class Leeftijd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("wat is je naam: ");
        String naam = scanner.nextLine();
        System.out.print("Beste "+naam+", geef je geboortejaar: ");
        int geboortejaar = scanner.nextInt();
        int leeftijd = LocalDate.now().getYear() - geboortejaar;

        System.out.println("Als alles goed loopt, word je dit jaar "+ leeftijd);
    }
}
