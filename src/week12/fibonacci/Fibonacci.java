package week12.fibonacci;

public class Fibonacci {
    private static final long MAX = 91;

    public static long calculateFinonacci(int n) throws FibonacciException {
        if(n < 0) {
            throw new FibonacciException("Negatieve waarden zijn uitgesloten!");
        }

        if(n > MAX) {
            throw new FibonacciException("De waarde van n is te groot!");
        }

        long eerste = 0;
        long tweede = 1;
        long getal = 0;

        for (int i = 0; i < n; i++) {
            getal = eerste + tweede;
            eerste = tweede;
            tweede = getal;
        }
        return getal;
    }
}
