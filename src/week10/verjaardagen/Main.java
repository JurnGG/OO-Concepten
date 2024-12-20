package week10.verjaardagen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person[] data = {
                new Person("Jeremy",  new Birthday(16, Month.MEI)),
                new Person("Bo",      new Birthday( 9, Month.DECEMBER)),
                new Person("Evelyne", new Birthday(15, Month.AUGUSTUS)),
                new Person("Jeremy",  new Birthday(23, Month.AUGUSTUS)),
                new Person("Divine",  new Birthday(25, Month.APRIL)),
                new Person("Ayoub",   new Birthday(15, Month.AUGUSTUS)),
                new Person("Jeremy",  new Birthday( 3, Month.AUGUSTUS)),
                new Person("Divine",  new Birthday(10, Month.APRIL))
        };
        List<Person> persons = new ArrayList<Person>(Arrays.asList(data));
        showPersons(persons);
        for (Person person : persons) {
        }
        System.out.println("\nGesorteerd op verjaardag:");
        showPersons(persons);
        // Sorteer personen alfabetisch
        // ...
        System.out.println("\nGesorteerd op naam:");
        showPersons(persons);
    }

    private static void showPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
