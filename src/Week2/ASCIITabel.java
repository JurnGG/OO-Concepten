package Week2;

public class ASCIITabel {
    public static void main(String[] args) {
        printASCIIRange(32, 127);

        System.out.println("\nUitbreiding: ASCII waarden van 128 tot en met 255");
        printASCIIRange(128, 255);

        System.out.println("\nUitbreiding: ASCII waarden van 256 tot en met 383");
        printASCIIRange(256, 383);
    }

    public static void printASCIIRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            System.out.printf("%c (%3d)   ", (char) i, i);
            count++;
            if (count % 6 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

