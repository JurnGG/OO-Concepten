package Week5.GrafischRekenmachine;

public class Calculator {
    private double minXValue;
    private double maxXValue;
    private TypeCurve typeCurve;

    public Calculator(double minXValue, double maxXValue, TypeCurve typeCurve) {
        this.minXValue = minXValue;
        this.maxXValue = maxXValue;
        this.typeCurve = typeCurve;
    }

    public void calculate() {
        int steps = 20;
        double stepSize = (maxXValue - minXValue) / steps;
        for (double i = minXValue; i <= maxXValue; i+=stepSize) {
            int y;

            switch (typeCurve) {
                case SINUS -> {
                    y = (int) (10 * Math.sin(i) + 10);
                }
                case COSINUS_HYBERBOLICUS -> {
                    y = (int) (10 * Math.cosh(i));
                }
                case WORTEL -> {
                    y = (int) Math.sqrt(10 * i);
                }
                default -> {
                    System.out.println("Unknown curve type");
                    return;
                }
            }

            // Print y spaces followed by '*'
            for (int j = 0; j < y; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
