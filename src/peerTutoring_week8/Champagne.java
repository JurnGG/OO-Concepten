package peerTutoring_week8;

import java.time.LocalDate;

public class Champagne extends Wijn {
    private Smaak smaak;

    public Champagne(String naam, String streek, LocalDate oogstDatum, double basisPrijs, Smaak smaak) {
        super(naam, streek, oogstDatum,basisPrijs);
        this.smaak = smaak;
    }

    public Smaak getSmaak() {
        return smaak;
    }

    @Override
    public double berekenPrijs() {
        if(smaak.toString().toLowerCase().contains("brut")){
           return super.berekenPrijs() + (super.berekenPrijs()*0.1);
        }

        return super.berekenPrijs();
    }

    @Override
    public String toString() {
        return super.toString() + " --> Type: "+smaak;

    }
}
