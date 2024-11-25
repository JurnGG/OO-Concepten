package Week4;

public class BierVat {
    private double capaciteit;
    private double inhoud;

    public BierVat(double capaciteit, double inhoud) {
        this.capaciteit = capaciteit;
        this.inhoud = inhoud;
    }

    public double getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(double capaciteit) {
        this.capaciteit = capaciteit;
    }

    public double getInhoud() {
        return inhoud;
    }

    public void setInhoud(double inhoud) {
        this.inhoud = inhoud;
    }

    public void fillFull(){
        this.inhoud = this.capaciteit;
    }

    public boolean isFull(){
        return this.inhoud == this.capaciteit;
    }

    public void tap(double amount){
        if (this.inhoud - amount < 0){
            this.inhoud = 0;
        } else {
            this.inhoud -= amount;
        }
    }

    public double percentageFilled(){
        return this.inhoud / this.capaciteit * 100;
    }
}
