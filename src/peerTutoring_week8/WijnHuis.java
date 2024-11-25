package peerTutoring_week8;

public class WijnHuis {
    private final int MAX_AANTAL = 10;
    private Wijn[] wijnen;
    private String naam;
    private int aantalWijnen;

    public WijnHuis(String naam) {
        this.naam = naam;
        this.wijnen = new Wijn[MAX_AANTAL];
        this.aantalWijnen = 0;
    }

    public boolean zoekWijn(Wijn w){
        for (Wijn wijn : wijnen) {
            if (wijn.getNaam().equals(w.getNaam())){
                return true;
            }
        }
        return false;
    }

    public boolean voegWijnToe(Wijn wijn){
        if (aantalWijnen < MAX_AANTAL && !zoekWijn(wijn)){
            wijnen[aantalWijnen] = wijn;
            aantalWijnen++;
            return true;
        }
        return false;
    }

    public Wijn getOudsteWijn(){
        Wijn oudste = wijnen[0];
        for (int i = 1; i < aantalWijnen; i++) {
            if (wijnen[i].getOogstDatum().isBefore(oudste.getOogstDatum())){
                oudste = wijnen[i];
            }
        }
        return oudste;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Wijnhuis ").append(naam).append(":\n").append("Wijnen:\n");
        StringBuilder champagnes = new StringBuilder("Champagnes:\n");
        StringBuilder likeuren = new StringBuilder("Likeuren:\n");

        for (int i = 0; i < aantalWijnen; i++) {
            if (wijnen[i] instanceof Champagne) {
                champagnes.append("\t").append(wijnen[i]).append("\n");
            } else if (wijnen[i] instanceof Likeur) {
                likeuren.append("\t").append(wijnen[i]).append("\n");
            } else {
                sb.append("\t").append(wijnen[i]).append("\n");
            }
        }

        sb.append(champagnes).append(likeuren);
        return sb.toString();
    }
}
