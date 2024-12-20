package week12.fibonacci;

public class DemoLeonarde {
    public static void main(String[] args) {
        try {
            Fibonacci.calculateFinonacci(-1);
        } catch (FibonacciException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 100; i++) {
            try {
            double deeltal = Fibonacci.calculateFinonacci(i + 1);
            long deler = Fibonacci.calculateFinonacci(i);
                System.out.printf("f(%d) / f(%d) = %.15f%n", i + 1, i, deeltal / deler);
            } catch (FibonacciException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
