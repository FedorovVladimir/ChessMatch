package pairs;

import javax.management.ObjectName;
import java.util.*;

public class ListPlayers {
    private  List <Human> listHuman = new ArrayList<Human>();
    public void addPlayer(Human human) {
        listHuman.add(human);
    }

    public Human getPlayer(int i) {
        return listHuman.get(i);
    }

    public void disablePlayer(int i) {
        listHuman.get(i).setActive(false);
    }

    public int size() {
        return listHuman.size();
    }

    public void sort() {
        Collections.sort(listHuman);
    }

    public void print() {
        for (Human h: listHuman) {
            System.out.println(h + " " + h.getPoint());
        }
    }
}
