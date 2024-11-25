package week7.laptops;

public enum CpuType {
    I3,I5,I7;

    @Override
    public String toString() {
        return name().charAt(0)+name().substring(1).toLowerCase();
    }
}
