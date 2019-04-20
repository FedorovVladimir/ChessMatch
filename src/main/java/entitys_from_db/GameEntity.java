package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "GAME", schema = "vladimir7_chess")
public class GameEntity {
    private int pkGame;
    private int pkPlayer;
    private int pkPlayerWhited;
    private int numberGame;
    private int numberBoard;
    private int pkTour;
    private int pkTournament;
    private int pkResult;
    private int pkDebut;
    private int pkEndgame;

    @Id
    @Column(name = "PK_GAME")
    public int getPkGame() {
        return pkGame;
    }

    public void setPkGame(int pkGame) {
        this.pkGame = pkGame;
    }

    @Basic
    @Column(name = "PK_PLAYER")
    public int getPkPlayer() {
        return pkPlayer;
    }

    public void setPkPlayer(int pkPlayer) {
        this.pkPlayer = pkPlayer;
    }

    @Basic
    @Column(name = "PK_PLAYER_WHITED")
    public int getPkPlayerWhited() {
        return pkPlayerWhited;
    }

    public void setPkPlayerWhited(int pkPlayerWhited) {
        this.pkPlayerWhited = pkPlayerWhited;
    }

    @Basic
    @Column(name = "NUMBER_GAME")
    public int getNumberGame() {
        return numberGame;
    }

    public void setNumberGame(int numberGame) {
        this.numberGame = numberGame;
    }

    @Basic
    @Column(name = "NUMBER_BOARD")
    public int getNumberBoard() {
        return numberBoard;
    }

    public void setNumberBoard(int numberBoard) {
        this.numberBoard = numberBoard;
    }

    @Basic
    @Column(name = "PK_TOUR")
    public int getPkTour() {
        return pkTour;
    }

    public void setPkTour(int pkTour) {
        this.pkTour = pkTour;
    }

    @Basic
    @Column(name = "PK_TOURNAMENT")
    public int getPkTournament() {
        return pkTournament;
    }

    public void setPkTournament(int pkTournament) {
        this.pkTournament = pkTournament;
    }

    @Basic
    @Column(name = "PK_RESULT")
    public int getPkResult() {
        return pkResult;
    }

    public void setPkResult(int pkResult) {
        this.pkResult = pkResult;
    }

    @Basic
    @Column(name = "PK_DEBUT")
    public int getPkDebut() {
        return pkDebut;
    }

    public void setPkDebut(int pkDebut) {
        this.pkDebut = pkDebut;
    }

    @Basic
    @Column(name = "PK_ENDGAME")
    public int getPkEndgame() {
        return pkEndgame;
    }

    public void setPkEndgame(int pkEndgame) {
        this.pkEndgame = pkEndgame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameEntity that = (GameEntity) o;

        if (pkGame != that.pkGame) return false;
        if (pkPlayer != that.pkPlayer) return false;
        if (pkPlayerWhited != that.pkPlayerWhited) return false;
        if (numberGame != that.numberGame) return false;
        if (numberBoard != that.numberBoard) return false;
        if (pkTour != that.pkTour) return false;
        if (pkTournament != that.pkTournament) return false;
        if (pkResult != that.pkResult) return false;
        if (pkDebut != that.pkDebut) return false;
        if (pkEndgame != that.pkEndgame) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkGame;
        result = 31 * result + pkPlayer;
        result = 31 * result + pkPlayerWhited;
        result = 31 * result + numberGame;
        result = 31 * result + numberBoard;
        result = 31 * result + pkTour;
        result = 31 * result + pkTournament;
        result = 31 * result + pkResult;
        result = 31 * result + pkDebut;
        result = 31 * result + pkEndgame;
        return result;
    }
}
