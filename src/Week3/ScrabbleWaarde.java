package Week3;

import java.util.Scanner;

public class ScrabbleWaarde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef uw scrabble woord in: ");
        String woord = scanner.nextLine();
        System.out.println("De scrabble waarde van " + woord + " is: " + calculateScrabbleWorth(woord.toLowerCase()));
    }

    public static int calculateScrabbleWorth(String w) {
        int waarde = 0;
        for (int i = 0; i < w.length(); i++) {
            char l = w.charAt(i);
            waarde += (calculateLetterWorth(l));
        }
        return waarde;
    }

    public static int calculateLetterWorth(char l){
        int waarde = 0;
        switch (l){
            case 'a','e','i','o','u','l','n','s','t','r'->{
                waarde = 1;
                break;
            }
            case 'd','g'->{
                waarde = 2;
                break;
            }
            case 'b','c','m','p'->{
                waarde = 3;
                break;
            }
            case 'f','h','v','w','y'->{
                waarde = 4;
                break;
            }
            case 'k'->{
                waarde = 5;
                break;
            }
            case 'j','x'->{
                waarde = 8;
                break;
            }
            case 'q','z'->{
                waarde = 10;
                break;
            }
        }
        return waarde;
    }
}
