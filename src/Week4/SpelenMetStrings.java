package Week4;

import java.util.Scanner;

public class SpelenMetStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een zin in: ");
        String zin = scanner.nextLine();

        System.out.println("Er zijn "+zin.length()+" tekens in de zin.");
        System.out.println(zin.toUpperCase());
        System.out.println(zin.toLowerCase());
        System.out.println("Het eerste karakter is een "+zin.charAt(0));
        System.out.println("Het laatste karakter is een "+zin.charAt(zin.length()-1));
        System.out.println("Er zijn "+zin.replaceAll(" ", "").length()+" karakters als je spaties weglaat.");
        System.out.println(zin.replaceAll("e", "_"));
        System.out.println(zin.replaceAll(" ", ""));
        System.out.println(zin.replaceAll("[aeiouAEIOU]", ""));


    }
}
