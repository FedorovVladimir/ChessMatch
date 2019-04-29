package pairs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human implements Comparable<Human> {

    private String firstName;
    private String secondName;
    private int ratingRus;
    private int ratingWorld;
    private boolean sex;
    private List<Game> listGamePlayed = new ArrayList<>();
    private String title;
    private String titleRus;
    private String region;

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleRus() {
        return titleRus;
    }

    public void setTitleRus(String titleRus) {
        this.titleRus = titleRus;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getRatingRus() {
        return ratingRus;
    }

    public void setRatingRus(int rating_rus) {
        this.ratingRus = rating_rus;
    }

    public void setRatingWorld(int rating_world) {
        this.ratingWorld = rating_world;
    }

    public int getRatingWorld() {
        return ratingWorld;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<Game> getListGamePlayed() {
        return listGamePlayed;
    }
    public void addGame(Game game) {
            listGamePlayed.add(game);
    }

    @Override
    public String toString() {
        return getSecondName() + " " + getFirstName() + " " + getRatingWorld();
    }

    public Human(String firstName, String secondName, int rating) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.ratingWorld = rating;
    }

    @Override
    public int compareTo(Human human) {
//        if (human.getRating() > this.getRating()) {
//            return 1;
//        }
//        if (human.getRating() < this.getRating()) {
//            return -1;
//        }
        return human.getSecondName().compareTo(this.getSecondName());
    }
}