package Week4;

import java.util.Scanner;

public class LampMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lamp livingRoomLamp = new Lamp(false);
        Lamp kitchenLamp = new Lamp(false);
        Lamp sleepingRoomLamp = new Lamp(false);
        int c;

        do{
            System.out.println("wat wil je doen?");
            System.out.println("1. alle lampen aan\n"
                    + "2. alle lampen uit\n"
                    + "3. Living en keuken aan (slaapkamer gaat uit)\n"
                    + "4. Slaapkamer aan (living en keuken gaan uit)\n"
                    + "5. stoppen");
            System.out.print("uw keuze: ");
            c = scanner.nextInt();

            switch (c){
                case 1 ->{
                    livingRoomLamp.switchOn();
                    kitchenLamp.switchOn();
                    sleepingRoomLamp.switchOn();
                }
                case 2 ->{
                    livingRoomLamp.switchOff();
                    kitchenLamp.switchOff();
                    sleepingRoomLamp.switchOff();
                }
                case 3 ->{
                    livingRoomLamp.switchOn();
                    kitchenLamp.switchOn();
                    sleepingRoomLamp.switchOff();
                }
                case 4 ->{
                    livingRoomLamp.switchOff();
                    kitchenLamp.switchOff();
                    sleepingRoomLamp.switchOn();
                }
                case 5 ->{
                    System.out.println("Goodbye");
                }
                default -> System.out.println("Invalid input");
            }

            if(c != 5){
                System.out.println("- lamp in de living: "+((livingRoomLamp.isOn())?"aan":"uit"));
                System.out.println("- lamp in de keuken: "+((kitchenLamp.isOn())?"aan":"uit"));
                System.out.println("- lamp in de slaapkamer: "+((sleepingRoomLamp.isOn())?"aan":"uit"));
                System.out.println("\n");
            }

        }while (c != 5);

    }
}
