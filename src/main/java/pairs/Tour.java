package pairs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tour {
    private int numberOfTour;
    static final int WHITE_WINS = 0;
    static final int BLACK_WINS = 1;
    static final int DRAW = 2;
    static final int MINUSL_PLUS = 3;
    static final int PLUS_MINUS = 4;
    static final int MINUS_MINUS = 5;
    static final int ZERO_ZERO = 6;
    List <PairsOfPlayer> listPairsOfPlayer = new ArrayList<PairsOfPlayer>();
    ListOfPlayers listOfPlayers;

    public void setNumberOfTour(int numberOfTour) {
        this.numberOfTour = numberOfTour;
    }

    public int getNumberOfTour() {
        return numberOfTour;
    }

    public void setListPairsOfPlayer(List<PairsOfPlayer> listPairsOfPlayer) {
        this.listPairsOfPlayer = listPairsOfPlayer;
    }

    public void makeTour() {
        for (int i = 0; i < listPairsOfPlayer.size(); i++) {
            //listPairsOfPlayer
        }

    }


}
