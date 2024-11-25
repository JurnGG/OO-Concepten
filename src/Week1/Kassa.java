package Week1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kassa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grootOuderKorting = 0, groepKorting = 0;
        DecimalFormat df = new DecimalFormat("0.00");


        System.out.print("aantal kinderen tussen 1m en 1,40m: ");
        int m1 = scanner.nextInt();

        System.out.print("aantal volwassen: ");
        int m2 = scanner.nextInt();

        System.out.print("aantal senioren (55+): ");
        int m3 = scanner.nextInt();
        int totaalMensen = m1 + m2 + m3;

        if(m3 >= 2){
            grootOuderKorting = berekenGrootOuderKorting(m1);
        }

        if(totaalMensen >= 10){
            groepKorting = berekenGroepKorting(m1, m2, m3);
        }

        double prijs = berekenPrijs(m1, m2, m3);
        boolean isGrootOuderKortingHoger= grootOuderKorting > groepKorting;
        double korting = isGrootOuderKortingHoger? grootOuderKorting: groepKorting;
        double totaal =  prijs - korting;



        System.out.println("*******************************\n" +
                "* Welkom in het pretpark! *\n" +
                "*******************************\n" +
                "* Prijs: "+df.format(prijs)+" EUR \n" +
                "* "+(isGrootOuderKortingHoger?"Grootouder korting":"Groep korting")+" -"+df.format(korting)+" EUR \n" +
                "* Totaal: "+df.format(totaal)+" EUR\n" +
                "**************************************");
    }
    public static double berekenPrijs(int m1, int m2, int m3){
        return (m1*26) + (m2*31) + (m3*15.50) ;
    }

    public static double berekenGrootOuderKorting(int m1){
        return (double) (m1 * 26) / 2;
    }

    public static double berekenGroepKorting(int m1, int m2, int m3){
        return berekenPrijs(m1, m2, m3) * 0.1;
    }

}
