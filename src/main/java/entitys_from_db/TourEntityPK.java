package entitys_from_db;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TourEntityPK implements Serializable {
    private int pkTour;
    private int pkTournament;

    @Column(name = "PK_TOUR")
    @Id
    public int getPkTour() {
        return pkTour;
    }

    public void setPkTour(int pkTour) {
        this.pkTour = pkTour;
    }

    @Column(name = "PK_TOURNAMENT")
    @Id
    public int getPkTournament() {
        return pkTournament;
    }

    public void setPkTournament(int pkTournament) {
        this.pkTournament = pkTournament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TourEntityPK that = (TourEntityPK) o;

        if (pkTour != that.pkTour) return false;
        if (pkTournament != that.pkTournament) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkTour;
        result = 31 * result + pkTournament;
        return result;
    }
}
