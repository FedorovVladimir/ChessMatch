package pairs;

import java.util.ArrayList;
import java.util.List;

public class Tour {
    private int numberOfTour;
    List <Game> listGame = new ArrayList<Game>();

    public void setNumberOfTour(int numberOfTour) {
        this.numberOfTour = numberOfTour;
    }

    public int getNumberOfTour() {
        return numberOfTour;
    }

    public void setLisrGame(List<Game> listGame) {
        this.listGame = listGame;
    }

    public void addGame(Game game) {
        this.listGame.add(game);
    }

    public void random() {
        for (Game g: listGame) {
            g.setResult(ResultGame.randomResult());
        }
    }

    public void print() {
        for (Game g: listGame) {
            System.out.println(g);
        }
    }
}
