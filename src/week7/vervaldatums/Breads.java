package week7.vervaldatums;

import java.time.LocalDate;

public class Breads {
    private Bread[] breads;
    private int count;
    private int nextNumber;

    public Breads() {
        breads = new Bread[100];
        count = 0;
        nextNumber = 1000;
    }

    public void addBread(Variety variety, LocalDate daysToExpiration) {
        if(count == breads.length) {
            System.out.println("Er kunnen geen broden meer toegevoegd worden.");
            return;
        }
        breads[count++] = new Bread(nextNumber++, variety, daysToExpiration);
    }

    public String PrintBreads() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(breads[i]).append("\n");
        }
        return sb.toString();
    }
    public String printExpired(LocalDate date){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if(breads[i].getExpirationDate().isEqual(date.plusDays(1))){
                sb.append(breads[i]).append("\n");
            }
        }
        return sb.toString();
    }
}
