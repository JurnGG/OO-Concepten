package week6.flexibeleLijst;

public class List {
    private int[] numbers;
    private int size;

    public List(int capacity) {
        numbers = new int[capacity];
        size = 0;
    }

    public boolean add(int number) {
        if (size < numbers.length) {
            numbers[size] = number;
            size++;
            return true;
        }

        return false;
    }

    public int size() {
        return size;
    }

    public int get(int i) {
        return (i >= size)?-1:numbers[i];
    }

    // Gevorderd
    public boolean remove(int index) {
        if (index >= size) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        size--;
        return true;
    }

}