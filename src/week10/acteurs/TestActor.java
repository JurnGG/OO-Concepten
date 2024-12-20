package week10.acteurs;

import week10.vliegtuigen.Plane;

import java.util.*;

public class TestActor {
    private static final Actor[] testdata = {
            new Actor("Cameron Diaz", 1972),
            new Actor("Anna Faris", 1976),
            new Actor("Angelina Jolie", 1975),
            new Actor("Jennifer Lopez", 1970),
            new Actor("Reese Witherspoon", 1976),
            new Actor("Neve Campbell", 1973),
            new Actor("Catherine Zeta-Jones", 1969),
            new Actor("Kirsten Dunst", 1982),
            new Actor("Kate Winslet", 1975),
            new Actor("Gina Philips", 1975),
            new Actor("Shannon Elisabeth", 1973),
            new Actor("Carmen Electra", 1972),
            new Actor("Drew Barrymore", 1975),
            new Actor("Elisabeth Hurley", 1965),
            new Actor("Tara Reid", 1975),
            new Actor("Katie Holmes", 1978),
            new Actor("Anna Faris", 1976)
    };

    public static void main(String[] args) {
        Actor reese = new Actor("Reese Witherspoon", 1976);
        Actor drew = new Actor("Drew Barrymore", 1975);
        Actor anna = new Actor("Anna Faris", 1976);
        Actor thandie = new Actor("Thandie Newton", 1972);

        List<Actor> actors = new ArrayList<>();
        actors.addAll(Arrays.asList(testdata));
        actors.add(reese);
        actors.add(drew);
        actors.add(anna);
        actors.add(thandie);

        for (Actor actor : actors) {
            System.out.println(actor);
        }

        actors.remove(reese);
        actors.remove(thandie);

        for (Iterator<Actor> it = actors.iterator(); it.hasNext(); ) {
            if (it.next().getBirthYear() == 1975) {
                it.remove();
            }
        }

        List<Actor> sortedActors= new ArrayList<>(new LinkedHashSet<>(actors));
        sortedActors.sort(Actor::compareTo);

        System.out.println("\n Uiteindelijke inhoud:\n");
        for (Actor actor : sortedActors) {
            System.out.println(actor);
        }
    }
}
