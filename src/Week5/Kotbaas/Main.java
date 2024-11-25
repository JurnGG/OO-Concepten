package Week5.Kotbaas;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 347.0);
        Room room2 = new Room(2, 431.0);
        Room room3 = new Room(3, 285.0);
        Room room4 = new Room(4, 354.0);

        room2.setStudentName("Halfhide Aleksey");
        room3.setStudentName("Mutambay Lotte");
        room4.setStudentName("Domen Tim");
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println(room4);
    }
}
