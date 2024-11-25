package week7.vervaldatums;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Breads breads = new Breads();
        for (int i = 0; i < 30; i++) {
            breads.addBread(Variety.values()[random.nextInt(Variety.values().length)], LocalDate.now().plusDays(random.nextInt(1,4)));
        }
        System.out.println(breads.PrintBreads());
        System.out.println("Broden die morgen vervallen :\n\n"+breads.printExpired(LocalDate.now()));
    }
}
