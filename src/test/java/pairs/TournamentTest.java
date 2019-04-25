package pairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class TournamentTest {

    @Test
    public void setListOfTour() {
    }

    @Test
    public void createTour() {
        ListPlayers ls= new ListPlayers();
        ls.addPlayer(new Human("1", "Efanov", 2150));
        ls.addPlayer(new Human("2", "gasgg", 1900));
        ls.addPlayer(new Human("2", "gsaggg", 2222));
        ls.addPlayer(new Human("3", "gsaghh", 2095));
        ls.addPlayer(new Human("4", "Efanov", 2192));
        ls.addPlayer(new Human("5", "Efanov", 1956));
        ls.addPlayer(new Human("6", "Efanov", 1896));
        ls.addPlayer(new Human("7", "Efanov", 2450));
        ls.addPlayer(new Human("8", "Efanov", 2000));
        ls.addPlayer(new Human("9", "Efanov", 1967));
        ls.addPlayer(new Human("10", "Efanov", 1822));
        ls.addPlayer(new Human("11", "Efanov", 2098));
        ls.addPlayer(new Human("12", "Efanov", 2014));
        ls.addPlayer(new Human("13", "Efanov", 2192));
        ls.addPlayer(new Human("14", "Efanov", 2177));
        ls.addPlayer(new Human("15", "Efanov", 2000));
        ls.addPlayer(new Human("16", "Efanov", 1989));
        ls.addPlayer(new Human("17", "Efanov", 2044));
        ls.addPlayer(new Human("18", "Efanov", 2234));
        ls.addPlayer(new Human("19", "Efanov", 2008));
        ls.addPlayer(new Human("20", "Efanov", 1992));
        ls.addPlayer(new Human("21", "Efanov", 2001));
        Tournament tournament = new Tournament();
        tournament.listPlayers = ls;
        ls.sort();
        tournament.createTour();
        for (Game g : tournament.getTour(0).listGame) {
            g.setResult(ResultGame.BLACK_WINS);
        }
        tournament.getTour(0).listGame.get(3).setResult(ResultGame.DRAW);
        tournament.getTour(0).listGame.get(7).setResult(ResultGame.DRAW);
        tournament.getTour(0).listGame.get(1).setResult(ResultGame.DRAW);
        tournament.getTour(0).listGame.get(4).setResult(ResultGame.WHITE_WINS);
        tournament.getTour(0).listGame.get(0).setResult(ResultGame.WHITE_WINS);
        tournament.getTour(0).listGame.get(9).setResult(ResultGame.WHITE_WINS);
        tournament.getTour(0).print();
        System.out.println();
        ls.sort();
        ls.print();


    }
}