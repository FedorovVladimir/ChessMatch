package pairs;

import java.util.ArrayList;
import java.util.List;

public class Tour {
    private int numberOfTour;
    List <Game> listGame = new ArrayList<Game>();
    ListPlayers listPlayers;

    public void setNumberOfTour(int numberOfTour) {
        this.numberOfTour = numberOfTour;
    }

    public int getNumberOfTour() {
        return numberOfTour;
    }

    public void setLisrGame(List<Game> listGame) {
        this.listGame = listGame;
    }

    public void setListPlayers(ListPlayers listPlayers) {
        this.listPlayers = listPlayers;
    }

    public void makeTour(int numberOfTour) {
        for (int i = 0; i < listPlayers.size() / 2; i ++) {
            listGame.add(new Game(listPlayers.getPlayer(i), listPlayers.getPlayer(listPlayers.size() / 2 + i), i + 1));
        }
    }
    public void print() {
        for (Game g: listGame) {
            System.out.println(g);
        }
    }
}
