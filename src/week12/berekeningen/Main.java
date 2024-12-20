package week12.berekeningen;


public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.append(Math.PI);
        numbers.append(42);
        numbers.append(1.61803);
        numbers.append(-7);
        Numbers numbers2 = new Numbers(numbers);
        numbers.add(3);
        numbers.add(numbers2);
        double mean = numbers.mean();
        System.out.println("gemiddelde = " + mean);
        System.out.println(numbers.getNumbers().toString());
    }
}
