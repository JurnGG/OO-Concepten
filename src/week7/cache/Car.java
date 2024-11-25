package week7.cache;

public class Car {
    private String Brand;
    private String Model;
    private TireSize tireSize;

    public Car(String brand, String model, TireSize tireSize) {
        Brand = brand;
        Model = model;
        this.tireSize = tireSize;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public TireSize getTireSize() {
        return tireSize;
    }

    @Override
    public String toString() {
        return Brand + " " + Model + " " + tireSize;
    }

}
