package peerTutoring_week8;

import java.time.LocalDate;

public class Wijn {
    private String naam;
    private String streek;
    private LocalDate oogstDatum;
    private double basisPrijs;

    public Wijn(String naam, String streek, LocalDate oogstDatum, double basisPrijs) {
        this.naam = naam;
        this.streek = streek;
        this.oogstDatum = oogstDatum;
        this.basisPrijs = basisPrijs;
    }

    public String getNaam() {
        return naam;
    }

    public String getStreek() {
        return streek;
    }

    public LocalDate getOogstDatum() {
        return oogstDatum;
    }

    protected double getBasisPrijs() {
        return basisPrijs;
    }

    public double berekenPrijs() {
        return basisPrijs;
    }

    public String getKenmerken() {
        return "Van "+oogstDatum.getYear()+", afkomstig van "+streek;
    }

    @Override
    public String toString() {
        return String.format("%-45s € %.2f\n\t(%s)", naam, berekenPrijs(), getKenmerken());
    }
}
