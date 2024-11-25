package week7;

import java.time.LocalDate;
import java.time.Period;

public class Leeftijd_2 {
    public static void main(String[] args) {
        LocalDate gbd = LocalDate.of(2006, 3, 17);
        Period age = Period.between(gbd, LocalDate.now());

        System.out.println("je bent " + age.getYears() + " jaar oud en " + age.getMonths() + " maand oud en " + age.getDays() + " dagen oud");
        System.out.println("je bent geboren op een " + gbd.getDayOfWeek());
    }
}
