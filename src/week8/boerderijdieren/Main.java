package week8.boerderijdieren;

public class Main {
    public static void main(String[] args) {
        Rabbit bugs = new Rabbit("Bugs", true);
        Cow belle = new Cow("Belle", 15.4);
        Rabbit bunny = new Rabbit("Bunny", false);
        Chicken kiekens = new Chicken("Generaal Kiekens", 3);
        Chicken chick = new Chicken("Chick", 4);
        Cow hannibal = new Cow("Hannibal", 3.2);

        FarmAnimal[] farmAnimals = {bugs, belle, bunny, kiekens, chick, hannibal};

        System.out.println("Details of Farm Animals:");
        for (FarmAnimal animal : farmAnimals) {
            System.out.println(animal.toString());
        }
    }
}
