package week9.werknemers;

public class Main {
    public static void main(String[] args) {
        double som =0;
        Employee[] employees = {
                new HourlyWorker("Jos", 57082332149L, 38),
                new HourlyWorker("Yousri", 61030350468L, 40),
                new SalariedEmployee("Sanae", 54110774131L, 1.6)
        };

        for (Employee employee : employees) {
            som += employee.getWages();
            System.out.println(employee+"\n");
        }
        System.out.printf("Som lonen: %.2f€", som);
    }
}
