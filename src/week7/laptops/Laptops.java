package week7.laptops;

import java.util.Arrays;

public class Laptops {
    private Laptop[] laptops;
    private int amount;

    public Laptops() {
        laptops = new Laptop[2000];
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public Laptop getLaptop(int index) {
        if(index < 0 || index >= amount){
            return null;
        }
        return laptops[index];
    }

    public void addLaptop(Laptop laptop) {
        if(amount == laptops.length){
            System.out.println("Laptop array is full");
            return;
        }
        laptops[amount] = laptop;
        amount++;
    }

    @Override
    public String toString() {
        StringBuilder result;
        result = new StringBuilder("Er zijn 4 laptops:\n");
        for (int i = 0; i < amount; i++) {
            if(laptops[i] != null){
                result.append(laptops[i]).append("\n");
            }
        }

        return result.toString();
    }
}
