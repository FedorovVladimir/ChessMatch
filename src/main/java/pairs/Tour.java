package pairs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Tour {
    private int numberOfTour;
    List <Game> listGame = new ArrayList<Game>();

    public void setNumberOfTour(int numberOfTour) {
        this.numberOfTour = numberOfTour;
    }

    public int getNumberOfTour() {
        return numberOfTour;
    }

    public void setLisrGame(List<Game> listGame) {
        this.listGame = listGame;
    }

    public void addGame(Game game) {
        this.listGame.add(game);
    }

    public void random() {
        for (Game g: listGame) {
            g.setResult(ResultGame.randomResult());
        }
    }

    public Game findGame(int start) {
        for (Game g : listGame) {
            if (g.indexOf(start) != null) {
                return g.indexOf(start);
            }
        }
        return null;
    }

    public void writeResult() throws IOException {
        FileInputStream fstream = new FileInputStream("test.trf");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String str;
        List <String> strLine = new ArrayList<>();
        String finalText = "";
        String drop = "";
        while ((str = br.readLine()) != null){
            strLine.add(str);
            String[] lex = str.split("\\s+");
            if (lex[0].equals("001")) {
                Game g = findGame(Integer.parseInt(lex[1]));
                if (g != null)
                if (g.getWhite().getNumberStart() == Integer.parseInt(lex[1])) {
                    str += "    " + g.getBlack().getNumberStart() + " b ";
                    if (g.getResult() == ResultGame.DRAW) {
                        str += '=';
                    }
                    else if (g.getResult() == ResultGame.WHITE_WINS) {
                        str += '1';
                    }
                    else {
                        str += '0';
                    }
                }
                else {
                    str += "    " + g.getWhite().getNumberStart() + " w ";
                    if (g.getResult() == ResultGame.DRAW) {
                        str += '=';
                    }
                    else if (g.getResult() == ResultGame.WHITE_WINS) {
                        str += '0';
                    }
                    else {
                        str += '1';
                    }
                }
                finalText += str + '\n';
            }
//            else {
//                drop += str + '\n';
//            }
            try(FileWriter writer = new FileWriter("test" + ".trf", false))
            {
                writer.write(drop + finalText + '\n');
            }
            catch(IOException ex){}
        }

    }

    public void print() {
        for (Game g: listGame) {
            System.out.println(g);
        }
    }
}
