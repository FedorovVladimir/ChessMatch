package entitys_from_db;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "TOURNAMENT", schema = "vladimir7_chess", catalog = "")
public class TournamentEntity {
    private int pkTournament;
    private int pkCountry;
    private int pkTypeCompetition;
    private int pkTimeContol;
    private int pkViewCompetition;
    private String nameTournament;
    private Date dateStart;
    private Date dateEnd;
    private String locationTournament;
    private int pkSystem;

    @Id
    @Column(name = "PK_TOURNAMENT")
    public int getPkTournament() {
        return pkTournament;
    }

    public void setPkTournament(int pkTournament) {
        this.pkTournament = pkTournament;
    }

    @Basic
    @Column(name = "PK_COUNTRY")
    public int getPkCountry() {
        return pkCountry;
    }

    public void setPkCountry(int pkCountry) {
        this.pkCountry = pkCountry;
    }

    @Basic
    @Column(name = "PK_TYPE_COMPETITION")
    public int getPkTypeCompetition() {
        return pkTypeCompetition;
    }

    public void setPkTypeCompetition(int pkTypeCompetition) {
        this.pkTypeCompetition = pkTypeCompetition;
    }

    @Basic
    @Column(name = "PK_TIME_CONTOL")
    public int getPkTimeContol() {
        return pkTimeContol;
    }

    public void setPkTimeContol(int pkTimeContol) {
        this.pkTimeContol = pkTimeContol;
    }

    @Basic
    @Column(name = "PK_VIEW_COMPETITION")
    public int getPkViewCompetition() {
        return pkViewCompetition;
    }

    public void setPkViewCompetition(int pkViewCompetition) {
        this.pkViewCompetition = pkViewCompetition;
    }

    @Basic
    @Column(name = "NAME_TOURNAMENT")
    public String getNameTournament() {
        return nameTournament;
    }

    public void setNameTournament(String nameTournament) {
        this.nameTournament = nameTournament;
    }

    @Basic
    @Column(name = "DATE_START")
    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    @Basic
    @Column(name = "DATE_END")
    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Basic
    @Column(name = "LOCATION_TOURNAMENT")
    public String getLocationTournament() {
        return locationTournament;
    }

    public void setLocationTournament(String locationTournament) {
        this.locationTournament = locationTournament;
    }

    @Basic
    @Column(name = "PK_SYSTEM")
    public int getPkSystem() {
        return pkSystem;
    }

    public void setPkSystem(int pkSystem) {
        this.pkSystem = pkSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TournamentEntity that = (TournamentEntity) o;

        if (pkTournament != that.pkTournament) return false;
        if (pkCountry != that.pkCountry) return false;
        if (pkTypeCompetition != that.pkTypeCompetition) return false;
        if (pkTimeContol != that.pkTimeContol) return false;
        if (pkViewCompetition != that.pkViewCompetition) return false;
        if (pkSystem != that.pkSystem) return false;
        if (nameTournament != null ? !nameTournament.equals(that.nameTournament) : that.nameTournament != null)
            return false;
        if (dateStart != null ? !dateStart.equals(that.dateStart) : that.dateStart != null) return false;
        if (dateEnd != null ? !dateEnd.equals(that.dateEnd) : that.dateEnd != null) return false;
        if (locationTournament != null ? !locationTournament.equals(that.locationTournament) : that.locationTournament != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkTournament;
        result = 31 * result + pkCountry;
        result = 31 * result + pkTypeCompetition;
        result = 31 * result + pkTimeContol;
        result = 31 * result + pkViewCompetition;
        result = 31 * result + (nameTournament != null ? nameTournament.hashCode() : 0);
        result = 31 * result + (dateStart != null ? dateStart.hashCode() : 0);
        result = 31 * result + (dateEnd != null ? dateEnd.hashCode() : 0);
        result = 31 * result + (locationTournament != null ? locationTournament.hashCode() : 0);
        result = 31 * result + pkSystem;
        return result;
    }
}
