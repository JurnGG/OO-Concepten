package week7.vervaldatums;

import java.time.LocalDate;

public class Bread {
    private int number;
    private Variety variety;
    private LocalDate expirationDate;

    public Bread(int number, Variety variety, LocalDate expirationDate) {
        this.number = number;
        this.variety = variety;
        this.expirationDate = expirationDate;
    }

    public int getNumber() {
        return number;
    }

    public Variety getVariety() {
        return variety;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Brood " + number + " (" + variety + ") vervalt op " + expirationDate;
    }
}
