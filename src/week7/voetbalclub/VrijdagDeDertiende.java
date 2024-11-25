package week7.voetbalclub;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VrijdagDeDertiende {
    public static void main(String[] args) {
        LocalDate b = LocalDate.of(2020, 1, 13); //Changed from 1 to 13 to add months instead of days (faster)
        LocalDate e = LocalDate.of(2029, 12, 31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        while (b.isBefore(e)) {
            if (b.getDayOfWeek() == DayOfWeek.FRIDAY && b.getDayOfMonth() == 13) {
                System.out.println(b.format(formatter));
            }
            b = b.plusMonths(1);
        }
    }
}
