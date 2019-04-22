package data_base;

import org.junit.Test;
import start.EmptyDataBase;
import start.entitys_test.Match;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestDataBase {
    public static EmptyDataBase emptyDataBase = new EmptyDataBase();
    @Test
    public void createListPlayers(){
        List<Match> listPlayers = emptyDataBase.getMatches();
    }

    @Test
    public void getElementList() throws Exception {
        emptyDataBase.getMatch(1);
        assertEquals(new EmptyDataBase().getMatch(1).getId(), emptyDataBase.getMatch(1).getId());
    }
}
