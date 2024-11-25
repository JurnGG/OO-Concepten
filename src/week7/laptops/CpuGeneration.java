package week7.laptops;

public enum CpuGeneration {
    SANDY_BRIDGE, IVY_BRIDGE, HASWELL, BROADWELL, SKYLAKE, KABYLAKE;

    @Override
    public String toString() {
        return name().charAt(0)+name().substring(1).toLowerCase().replaceAll("_", " ");
    }

}
