package pairs;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String nameOfTUrnament;
    private int numberOfTour;
    List<Tour> listOfTour = new ArrayList<>();

    public String getNameOfTUrnament() {
        return nameOfTUrnament;
    }

    public void setNameOfTUrnament(String nameOfTUrnament) {
        this.nameOfTUrnament = nameOfTUrnament;
    }

    public int getNumberOfTour() {
        return numberOfTour;
    }

    public void setNumberOfTour(int numberOfTour) {
        this.numberOfTour = numberOfTour;
    }

    public List<Tour> getListOfTour() {
        return listOfTour;
    }

    public void setListOfTour(List<Tour> listOfTour) {
        this.listOfTour = listOfTour;
    }

    public void createTour(){

    }

}
