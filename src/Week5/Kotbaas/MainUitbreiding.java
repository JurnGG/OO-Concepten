package Week5.Kotbaas;

public class MainUitbreiding {
    public static void main(String[] args) {
        RoomUitbreiding room1 = new RoomUitbreiding(1, 347.0);
        RoomUitbreiding room2 = new RoomUitbreiding(2, 431.0);
        RoomUitbreiding room3 = new RoomUitbreiding(3, 285.0);
        RoomUitbreiding room4 = new RoomUitbreiding(4, 354.0);

        room2.setStudent(new Student("Halfhide Aleksey", "Stationstraat 42", "Gent", 9000));
        room3.setStudent(new Student("Mutambay Lotte", "Boomforeeststraat 12", "Antwerpen", 2000));
        room4.setStudent(new Student("Domen Tim", "Zonnebloemstraat 7" , "Brussel", 1000));
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println(room4);
    }
}
