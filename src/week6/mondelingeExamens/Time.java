package week6.mondelingeExamens;

public class Time {
    private int hours;
    private int minutes;

    public Time(String time) {
        String[] t = time.split(":");

        this.hours = Integer.parseInt(t[0]);
        this.minutes = Integer.parseInt(t[1]);
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void addMinutes(int m){
        this.minutes += m;
        this.hours += this.minutes / 60;
        this.minutes = this.minutes % 60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }
}
