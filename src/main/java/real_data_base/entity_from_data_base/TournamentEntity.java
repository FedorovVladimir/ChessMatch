package real_data_base.entity_from_data_base;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TOURNAMENT", schema = "vladimir7_match", catalog = "")
public class TournamentEntity {
    private int id;
    private String name;
    private Date dateStart;
    private Date dateEnd;
    private String adress;
    private String timeControl;
    private CityEntity city;
    private SystemMatchEntity systemMatch;
    private RegionEntity region;

    public SystemMatchEntity getSystemMatch() {
        return systemMatch;
    }

    public void setSystemMatch(SystemMatchEntity systemMatch) {
        this.systemMatch = systemMatch;
    }

    public RegionEntity getRegion() {
        return region;
    }

    public void setRegion(RegionEntity region) {
        this.region = region;
    }

    public CityEntity getIndicator() {
        return indicator;
    }

    public void setIndicator(CityEntity indicator) {
        this.indicator = indicator;
    }

    private CityEntity indicator;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "ADRESS")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }
    @Basic
    @Column(name = "TIME_CONTROL")
    public String getTimeControl() {
        return timeControl;
    }

    public void setTimeControl(String timeControl) {
        this.timeControl = timeControl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TournamentEntity that = (TournamentEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(dateStart, that.dateStart) &&
                Objects.equals(dateEnd, that.dateEnd) &&
                Objects.equals(adress, that.adress) &&
                Objects.equals(timeControl, that.timeControl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateStart, dateEnd, adress, timeControl);
    }

    @Override
    public String toString() {
        return "TournamentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", adress='" + adress + '\'' +
                ", timeControl='" + timeControl + '\'' +
                '}';
    }
}
