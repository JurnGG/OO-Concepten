package Week5.Kotbaas;

public class Room {
    private int roomNumber;
    private String studentName;
    private double pricePerMonth;

    public Room(int roomNumber, double pricePerMonth) {
        this.roomNumber = roomNumber;
        this.pricePerMonth = pricePerMonth;
        studentName = "leegstaand";
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getPricePerMonth() {
        return pricePerMonth;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setPricePerMonth(double pricePerMonth) {
        this.pricePerMonth = pricePerMonth;
    }

    @Override
    public String toString() {
        return "Kamer "+roomNumber+": "+studentName+" ("+pricePerMonth+"$)";
    }
}
