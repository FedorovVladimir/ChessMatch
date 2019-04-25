package pairs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human implements Comparable<Human>{

    private String firstName;
    private String secondName;
    private int rating_rus;
    private int rating_world;
    private boolean motion;
    private boolean active;
    private List<Game> listGamePlayed = new ArrayList<>();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setRating(int rating) {
        this.rating_rus = rating;
    }

    public void setActive(boolean active) { this.active = active; }

    public void setMotion(boolean motion) { this.motion = motion; }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getRating() {
        return rating_rus;
    }

    public boolean getActive() {
        return active;
    }

    public boolean getMotion() { return motion; }

    public List<Game> getListGamePlayed() {
        return listGamePlayed;
    }
    public void addGame(Game game) {
        listGamePlayed.add(game);
    }

//    public Human() {
//        String string = new String();
//        Random random = new Random();
//        this.rating_rus = random.nextInt(1000) + 1500;
//
//        int leftLimit = 97; // letter 'a'
//        int rightLimit = 122; // letter 'z'
//        int targetStringLength = random.nextInt(5) + 3;
//        StringBuilder buffer = new StringBuilder(targetStringLength);
//        for (int i = 0; i < targetStringLength; i++) {
//            int randomLimitedInt = leftLimit + (int)
//                    (random.nextFloat() * (rightLimit - leftLimit + 1));
//            buffer.append((char) randomLimitedInt);
//        }
//        this.firstName = buffer.toString();
//        targetStringLength = random.nextInt(5) + 3;
//        buffer = new StringBuilder(targetStringLength);
//        for (int i = 0; i < targetStringLength; i++) {
//            int randomLimitedInt = leftLimit + (int)
//                    (random.nextFloat() * (rightLimit - leftLimit + 1));
//            buffer.append((char) randomLimitedInt);
//        }
//        this.secondName = buffer.toString();
//        this.active = true;
//    }

    @Override
    public String toString() {
        return getSecondName() + " " + getFirstName() + " " + getRating();
    }

    public Human(String firstName, String secondName, int rating) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.rating_rus = rating;
        this.active = true;
    }
    public int compare(Human human, Human t1) {
        if (human.getRating() > t1.getRating()) {
            return 1;
        }
        if (human.getRating() < t1.getRating()) {
            return -1;
        }
        return human.getSecondName().compareTo(t1.getSecondName());
    }

    @Override
    public int compareTo(Human human) {
        if (human.getRating() > this.getRating()) {
            return 1;
        }
        if (human.getRating() < this.getRating()) {
            return -1;
        }
        return human.getSecondName().compareTo(this.getSecondName());
    }
}