package week7.laptops;

public class Laptop {
    private String owner;
    private CpuGeneration cpuGeneration;
    private CpuType cpuType;
    private int ram;
    private int disk;
    private Brand brand;

    public Laptop(String owner, CpuGeneration cpuGeneration, CpuType cpuType, int ram, int disk, Brand brand) {
        this.owner = owner;
        this.cpuGeneration = cpuGeneration;
        this.cpuType = cpuType;
        this.ram = ram;
        this.disk = disk;
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getDisk() {
        return disk;
    }

    public int getRam() {
        return ram;
    }

    public CpuType getCpuType() {
        return cpuType;
    }

    public CpuGeneration getCpuGeneration() {
        return cpuGeneration;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Laptop van "+owner+": "+brand+" ("+cpuType+" "+cpuGeneration+"), "+ram+"GB, "+disk+"GB";
    }
}
