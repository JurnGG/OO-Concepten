package week10.lottogetallen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoNumbers {
    private List<Integer> numbers;
    private int[] lottoNumbers;

    public LottoNumbers() {
        numbers = new ArrayList<>();
        for(int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
        lottoNumbers = new int[6];
    }

    public void generateLottoNumbers(){
        Collections.shuffle(numbers);
        for(int i = 0; i < 6; i++) {
            lottoNumbers[i] = numbers.get(i);
        }
    }

    public String showLottoNumbers() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            sb.append(lottoNumbers[i] + " ");
        }
        return sb.toString();
    }
}
