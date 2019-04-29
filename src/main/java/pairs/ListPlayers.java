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

    public int size() {
        return listHuman.size();
    }

    public void sort() {
        Collections.sort(listHuman);
        for (int i = 0; i < listHuman.size(); i++) {
            listHuman.get(i).setNumberStart(i + 1);
        }
    }

    public String convertToFile () {
        String finalString = "";
        for (Human h : listHuman) {
            finalString += h.convetToFile();
        }
        return finalString;
    }

    public void print() {
        for (Human h: listHuman) {
            System.out.println(h);
        }
    }
}
