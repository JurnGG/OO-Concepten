package week12.parameter;

public class BodyMeusures{
    private double bust;
    private double hips;
    private double waist;

    public BodyMeusures(){
        bust = 90;
        hips = 60;
        waist = 90;
    }

    public BodyMeusures(double bust, double hips, double waist) {
        this.bust = bust;
        this.hips = hips;
        this.waist = waist;
    }

    public double getBust() {
        return bust;
    }

    public double getHips() {
        return hips;
    }

    public double getWaist() {
        return waist;
    }

    @Override
    public String toString() {
        return bust + " " + hips + " " + waist;
    }
}
