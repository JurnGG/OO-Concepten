package Week4;

public class AutoMain {
    public static void main(String[] args) {
        Auto Renault = new Auto("Renault", "Scénic", 8);
        Auto Porsche = new Auto("Porsche", "911 GT3", 19);
        Auto RollsRoyce = new Auto("Rolls-Royce", "Phantom", 32);

        System.out.println("Renault: " + Renault.calculateTax());
        System.out.println("Porsche: " + Porsche.calculateTax());
        System.out.println("Rolls-Royce: " + RollsRoyce.calculateTax());

    }
}
