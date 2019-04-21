package entitys_from_db;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TOUR", schema = "vladimir7_chess", catalog = "")
@IdClass(TourEntityPK.class)
public class TourEntity {
    private int pkTour;
    private int pkTournament;
    private Timestamp dateTour;
    private int numberTour;

    @Id
    @Column(name = "PK_TOUR")
    public int getPkTour() {
        return pkTour;
    }

    public void setPkTour(int pkTour) {
        this.pkTour = pkTour;
    }

    @Id
    @Column(name = "PK_TOURNAMENT")
    public int getPkTournament() {
        return pkTournament;
    }

    public void setPkTournament(int pkTournament) {
        this.pkTournament = pkTournament;
    }

    @Basic
    @Column(name = "DATE_TOUR")
    public Timestamp getDateTour() {
        return dateTour;
    }

    public void setDateTour(Timestamp dateTour) {
        this.dateTour = dateTour;
    }

    @Basic
    @Column(name = "NUMBER_TOUR")
    public int getNumberTour() {
        return numberTour;
    }

    public void setNumberTour(int numberTour) {
        this.numberTour = numberTour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TourEntity that = (TourEntity) o;

        if (pkTour != that.pkTour) return false;
        if (pkTournament != that.pkTournament) return false;
        if (numberTour != that.numberTour) return false;
        if (dateTour != null ? !dateTour.equals(that.dateTour) : that.dateTour != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkTour;
        result = 31 * result + pkTournament;
        result = 31 * result + (dateTour != null ? dateTour.hashCode() : 0);
        result = 31 * result + numberTour;
        return result;
    }
}
