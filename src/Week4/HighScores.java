package Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class HighScores {
    public static void main(String[] args) {
        Player hasti = new Player();
        Player jonas = new Player();
        Player Bogdan = new Player();

        hasti.setName("Hasti");
        hasti.setScore(1020);
        jonas.setName("Jonas");
        jonas.setScore(610);
        Bogdan.setName("Bogdan");
        Bogdan.setScore(460);

        displayHighScores(hasti, jonas, Bogdan);
    }
    public static void displayHighScores(Player p1, Player p2, Player p3) {
        ArrayList<Player> players = new ArrayList<>(Arrays.asList(p1, p2, p3));

        players.sort((a, b) -> b.getScore() - a.getScore());

        for (Player player : players) {
            System.out.println(player.getName() + " - " + player.getScore());
        }

    }
}
