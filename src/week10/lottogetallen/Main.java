package week10.lottogetallen;

public class Main {
    public static void main(String[] args) {
        LottoNumbers lottoNumbers = new LottoNumbers();
        for (int i = 0; i < 10; i++) {
            lottoNumbers.generateLottoNumbers();
            System.out.println(lottoNumbers.showLottoNumbers());
        }
    }
}
