package week7.laptops;

public enum Brand {
    ACER,APPLE,ASUS,DELL,HP,LENOVO,MEDION,TOSHIBA;

    @Override
    public String toString() {
        return name().charAt(0)+name().substring(1).toLowerCase();
    }
}
