package start;

import start.entitys_test.Match;

import java.util.List;

public interface DataBase {
    Match getMatch(int id) throws Exception;
    List<Match> getMatches();
}
