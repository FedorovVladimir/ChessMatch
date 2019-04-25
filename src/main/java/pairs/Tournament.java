package pairs;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String nameOfTUrnament;
    private int numberTour;
    List<Tour> listTour = new ArrayList<>();
    ListPlayers listPlayers;
    public String getNameOfTUrnament() {
        return nameOfTUrnament;
    }

    public void setNameOfTUrnament(String nameOfTUrnament) {
        this.nameOfTUrnament = nameOfTUrnament;
    }

    public int getNumberTour() {
        return numberTour;
    }

    public void setNumberTour(int numberOfTour) {
        this.numberTour = numberOfTour;
    }

    public List<Tour> getListTour() {
        return listTour;
    }
    public Tour getTour(int i) {
        return listTour.get(i);
    }

    public void setListOfTour(List<Tour> listOfTour) {
        this.listTour = listOfTour;
    }

    public void createTour() {
        Tour new_t = new Tour();
        new_t.setListPlayers(listPlayers);
        new_t.makeTour(listTour.size() + 1);
        listTour.add(new_t);
    }

}
