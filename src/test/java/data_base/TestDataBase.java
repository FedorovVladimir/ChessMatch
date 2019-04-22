package data_base;

import org.junit.Test;
import start.EmptyDataBase;
import start.entitys_test.Match;

import java.util.List;

public class TestDataBase {
    public static EmptyDataBase emptyDataBase = new EmptyDataBase();
    @Test
    public void createListPlayers(){
        List<Match> listPlayers = emptyDataBase.getMatchs();
    }
}
