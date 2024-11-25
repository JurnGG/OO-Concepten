package Week1;

import java.util.Scanner;

public class Cowsay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("geef een zin: ");
        String zin = scanner.nextLine();

        System.out.println("______________________");
        System.out.println("< "+zin+" >");
        System.out.println("______________________");
        System.out.println("----------------------\n" +
                "     \\   ^__^\n" +
                "      \\  (oo)\\_______\n" +
                "         (__)\\       )\\/\\\n" +
                "          U ||----w |\n" +
                "            ||      ||");
    }
}
