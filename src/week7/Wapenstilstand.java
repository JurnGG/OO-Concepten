package week7;

import java.time.LocalDate;

public class Wapenstilstand {
    public static void main(String[] args) {
        LocalDate wapenstilstand = LocalDate.of(1918, 11, 11);

        System.out.println("wapenstilstand ("+wapenstilstand+") viel op een "+wapenstilstand.getDayOfWeek());
        System.out.println("in deze jaren valt wapenstilstand op een zondag:");
        for (int jaar = 1980; jaar <= 2040; jaar ++) {
            LocalDate datum = LocalDate.of(jaar, 11, 11);
            if (datum.getDayOfWeek().toString().equals("SUNDAY")) {
                System.out.print(datum.getYear()+ " ");
            }
        }
    }
}
