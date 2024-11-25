package week9.werknemers;

public class HourlyWorker extends Employee{
    private final int MAX_HOURS_PER_WEEK =38;
    private int hours;

    public HourlyWorker(String name, Long nationalNumber, int hours) {
        super(name, nationalNumber);
        this.hours = hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double getWages(){
        if(hours > MAX_HOURS_PER_WEEK){
            return MAX_HOURS_PER_WEEK * HOURLY_WAGES + (hours - MAX_HOURS_PER_WEEK) * HOURLY_WAGES * 1.5;
        }

        return hours * HOURLY_WAGES;
    }

    @Override
    public String toString() {
        return String.format("%s\nLoon: %.2f€", super.toString(), getWages());
    }
}
