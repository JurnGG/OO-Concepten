package Week2;

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("geef een string in: ");
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int codepoint = (int) c;
            System.out.println(c + " heeft een codepoint gelijk aan " + codepoint);
        }

    }
}

