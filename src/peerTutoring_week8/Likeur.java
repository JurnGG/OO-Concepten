package peerTutoring_week8;

import java.time.LocalDate;

public class Likeur extends Wijn{
    private double alcoholGehalte;

    public Likeur(String naam, String streek, LocalDate oogstDatum, double basisPrijs, double alcoholGehalte) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.alcoholGehalte = alcoholGehalte;
    }

    @Override
    public double berekenPrijs() {
         if(alcoholGehalte > 0.5){
             return super.berekenPrijs() + super.berekenPrijs()/4;
         }
         return super.berekenPrijs();
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" --> %d%% alc", (int)(alcoholGehalte*100));
    }
}
