package week6.zoekenEnTellen;

import java.util.Arrays;

public class Number {
    private int[] numbers;

    public Number(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int numberOfTimes(int number) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                count++;
            }
        }
        return count;
    }

    public boolean isPresent(int number){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Numbers :" + Arrays.toString(numbers);
    }
}
