package pairs;

public class Game {
    private Human white;
    private Human black;
    private int result;
    private int numberOfDesk;
    public void setBlack(Human black) {
        this.black = black;
    }

    public void setWhite(Human white) {
        this.white = white;
    }

    public Human getBlack() {
        return black;
    }

    public Human getWhite() {
        return white;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public int getNumberOfDesk() {
        return numberOfDesk;
    }

    public void setNumberOfDesk(int numberOfDesk) {
        this.numberOfDesk = numberOfDesk;
    }

    public Game(Human white, Human black) {
        this.white = white;
        this.black = black;
    }

    public Game(Human white, Human black, int numberOfDesk) {
        this.white = white;
        this.black = black;
        this.numberOfDesk = numberOfDesk;
    }
}
