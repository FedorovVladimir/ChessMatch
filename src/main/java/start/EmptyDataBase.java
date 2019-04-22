package start;

import start.entitys_test.Match;

import java.util.LinkedList;
import java.util.List;

public class EmptyDataBase implements DataBase {

    private List<Match> players = new LinkedList<>();

    public EmptyDataBase(){}
    @Override
    public Match getMatch(int id) throws Exception {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getId() == id) {
                return players.get(i);
            }
        }
        throw new Exception("ID is not correct");
    }

    @Override
    public List<Match> getMatchs() {
        return players;
    }
}

