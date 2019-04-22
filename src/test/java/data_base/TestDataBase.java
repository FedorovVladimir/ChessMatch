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
        System.out.println(emptyDataBase.getMatch(1).getFio());
    }

    @Test
    public void addElementInList() throws Exception {
        emptyDataBase.add(new Match((long) 2, "Этап кубка России", "Барнаул", "24.02.2019", "1", "23", "FM", "Ефанов Михаил", "04.04.1997", "КМС", "2168", "2158", "Алтайский край", "021421412", "9", "37"));
        Long id = 2L;
        assertEquals(id, emptyDataBase.getMatch(2).getId());
    }

}
