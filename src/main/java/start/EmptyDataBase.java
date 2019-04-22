package start;

import start.entitys_test.Match;

import java.util.LinkedList;
import java.util.List;

public class EmptyDataBase implements DataBase {

    private List<Match> players = new LinkedList<>();

    public EmptyDataBase(){
        players.add(new Match((long) 1, "Этап кубка России", "Барнаул", "24.02.2019", "1", "23", "FM", "Ефанов Михаил", "04.04.1997", "КМС", "2168", "2158", "Алтайский край", "021421412", "9", "37"));
    }
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
    public List<Match> getMatches() {
        return players;
    }
}

