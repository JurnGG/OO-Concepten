package Week5.Kotbaas;

public class RoomUitbreiding {
    private int roomNumber;
    private Student student;
    private double pricePerMonth;

    public RoomUitbreiding(int roomNumber, double pricePerMonth) {
        this.roomNumber = roomNumber;
        this.pricePerMonth = pricePerMonth;
        student = new Student();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String  getStudent() {
        return student.toString();
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setPricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    @Override
    public String toString() {
        return "Kamer "+roomNumber+": "+student.toString()+" ("+pricePerMonth+"$)";
    }
}
