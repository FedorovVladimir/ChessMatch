package pairs;

import java.util.ArrayList;
import java.util.List;

enum result{
    WHITE_WINS,
    BLACK_WINS,
    DRAW,
    MINUS_PLUS,
    PLUS_MINUS,
    MINUS_MINUS,
    ZERO_ZERO
}


public class Tour {
    private int numberOfTour;
    List <Game> listGame = new ArrayList<Game>();
    ListOfPlayers listOfPlayers;

    public void setNumberOfTour(int numberOfTour) {
        this.numberOfTour = numberOfTour;
    }

    public int getNumberOfTour() {
        return numberOfTour;
    }

    public void setListPairsOfPlayer(List<Game> listGame) {
        this.listGame = listGame;
    }

    public void makeTour() {
        for (int i = 0; i < listOfPlayers.size(); i += 2) {
            listGame.get(i);
        }

    }


}
