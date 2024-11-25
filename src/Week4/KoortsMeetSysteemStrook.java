package Week4;

import java.util.Scanner;

public class KoortsMeetSysteemStrook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef een woord: ");
        String w = scanner.nextLine();
        System.out.println((isPalidroom(w.toLowerCase())?"Het woord is een palindroom.":"Het woord is geen palindroom."));
    }
    public static boolean isPalidroom(String w) {
        int i = 0;
        int j = w.length() - 1;
        while (i < j) {
            if (w.charAt(i) != w.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
