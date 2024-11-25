package week7.cache;

public class Main {
    public static void main(String[] args) {
        Car clio = new Car("renault", "clio", TireSizeFactory.create(185, 65, 15));
        Car sandero = new Car("dacia", "sandero", TireSizeFactory.create(185, 65, 15));
        Car bmw = new Car("bmw", "4 serie", TireSizeFactory.create(225, 35, 20));
        Car c3 = new Car("citroen", "c3", TireSizeFactory.create(185, 65, 15));

        System.out.println(clio);
        System.out.println(sandero);
        System.out.println(bmw);
        System.out.println(c3);

    }
}
