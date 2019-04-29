package pairs;

import javafo.api.JaVaFoApi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String nameOfTurnament;
    private String location;
    private String region;
    private String startDate;
    private String endDate;
    private int countOfPlayers;
    private int countOfPlayersWithRating;
    private String conductionSystem;
    private String mainArbiter;
    private String timeSystem;
    private int countOfTour;

    public String getNameOfTurnament() {
        return nameOfTurnament;
    }

    public void setNameOfTurnament(String nameOfTurnament) {
        this.nameOfTurnament = nameOfTurnament;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCountOfPlayers() {
        return countOfPlayers;
    }

    public void setCountOfPlayers(int countOfPlayers) {
        this.countOfPlayers = countOfPlayers;
    }

    public int getCountOfPlayersWithRating() {
        return countOfPlayersWithRating;
    }

    public void setCountOfPlayersWithRating(int countOfPlayersWithRating) {
        this.countOfPlayersWithRating = countOfPlayersWithRating;
    }

    public String getConductionSystem() {
        return conductionSystem;
    }

    public void setConductionSystem(String conductionSystem) {
        this.conductionSystem = conductionSystem;
    }

    public String getMainArbiter() {
        return mainArbiter;
    }

    public void setMainArbiter(String mainArbiter) {
        this.mainArbiter = mainArbiter;
    }

    public String getTimeSystem() {
        return timeSystem;
    }

    public void setTimeSystem(String timeSystem) {
        this.timeSystem = timeSystem;
    }

    public int getCountOfTour() {
        return countOfTour;
    }

    public void setCountOfTour(int countOfTour) {
        this.countOfTour = countOfTour;
    }

    public ListPlayers getListPlayers() {
        return listPlayers;
    }

    public void setListPlayers(ListPlayers listPlayers) {
        this.listPlayers = listPlayers;
    }



    List<Tour> listTour = new ArrayList<>();

    ListPlayers listPlayers;

    public void createFileTurnament() {
        try(FileWriter writer = new FileWriter(nameOfTurnament + ".trf", false))
        {
            String text = "";
            text += "012 " + nameOfTurnament + '\n';
            text += "022 " + location + '\n';
            text += "032 " + region + '\n';
            text += "042 " + startDate + '\n';
            text += "052 " + endDate + '\n';
            text += "062 " + countOfPlayers + '\n';
            text += "072 " + countOfPlayersWithRating + '\n';
            text += "092 " + conductionSystem + '\n';
            text += "102 " + mainArbiter + '\n';
            text += "122 " + timeSystem + '\n';
            text += "132                                                                                      " + '\n';
            text += "XXR " + countOfTour + '\n';
            text += "XXC white1"  + '\n';
            text += listPlayers.convertToFile();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
        }

    }

    public void createTour() {
        Tour new_t = new Tour();
        new_t.setListPlayers(listPlayers);
        new_t.makeTour(listTour.size() + 1);
        listTour.add(new_t);
    }

}
