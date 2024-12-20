package week12.berekeningen;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private List<Double> numbers;

    public Numbers() {
        numbers = new ArrayList<>();
    }

    public Numbers(Numbers other) {
        this.numbers = new ArrayList<>(other.numbers);
    }

    public List<Double> getNumbers() {
        return numbers;
    }

    public void append(double d){
        if(Double.isInfinite(d) || Double.isNaN(d)){
            throw new ArithmeticException("Infinite or NaN values are not allowed");
        }
        numbers.add(d);
    }

    public void add(double d){
        if(Double.isInfinite(d) || Double.isNaN(d)){
            throw new ArithmeticException("Infinite or NaN values are not allowed");
        }
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + d);
        }
    }

    public void add(Numbers other){
        if (numbers.size() != other.numbers.size()){
            throw new ArithmeticException("The lists are not of the same size");
        }
        for (int i = 0; i < numbers.size(); i++){
            numbers.set(i, numbers.get(i) + other.numbers.get(i));
        }
    }

    public void multiply(double d){
        if(Double.isInfinite(d) || Double.isNaN(d)){
            throw new ArithmeticException("Infinite or NaN values are not allowed");
        }
        for(Double number : numbers){
            number *= d;
        }
    }

    public Double mean(){
        if(numbers.size() == 0){
            throw new ArithmeticException("The list is empty");
        }

        return numbers.stream().mapToDouble(Double::doubleValue).average().orElseThrow(() -> new ArithmeticException("Error calculating mean"));
    }
}
