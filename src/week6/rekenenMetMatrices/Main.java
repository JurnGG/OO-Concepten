package week6.rekenenMetMatrices;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] first = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] second = { {4, 5, 6}, {7, 8, 9}, {1, 2, 3} };

        System.out.println( Arrays.deepToString(addMatrix(first, second)));

    }

    public static int[][] addMatrix(int[][] first, int[][] second) {
        int[][] result = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }
}
