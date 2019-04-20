package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "TIME_CONTROL", schema = "vladimir7_chess")
public class TimeControlEntity {
    private int pkTimeContol;
    private String codeTimeControl;
    private int minutesTimeControl;
    private int secondsTimeControl;
    private int addTimeControl;
    private int pkRegime;

    @Id
    @Column(name = "PK_TIME_CONTOL")
    public int getPkTimeContol() {
        return pkTimeContol;
    }

    public void setPkTimeContol(int pkTimeContol) {
        this.pkTimeContol = pkTimeContol;
    }

    @Basic
    @Column(name = "CODE_TIME_CONTROL")
    public String getCodeTimeControl() {
        return codeTimeControl;
    }

    public void setCodeTimeControl(String codeTimeControl) {
        this.codeTimeControl = codeTimeControl;
    }

    @Basic
    @Column(name = "MINUTES_TIME_CONTROL")
    public int getMinutesTimeControl() {
        return minutesTimeControl;
    }

    public void setMinutesTimeControl(int minutesTimeControl) {
        this.minutesTimeControl = minutesTimeControl;
    }

    @Basic
    @Column(name = "SECONDS_TIME_CONTROL")
    public int getSecondsTimeControl() {
        return secondsTimeControl;
    }

    public void setSecondsTimeControl(int secondsTimeControl) {
        this.secondsTimeControl = secondsTimeControl;
    }

    @Basic
    @Column(name = "ADD_TIME_CONTROL")
    public int getAddTimeControl() {
        return addTimeControl;
    }

    public void setAddTimeControl(int addTimeControl) {
        this.addTimeControl = addTimeControl;
    }

    @Basic
    @Column(name = "PK_REGIME")
    public int getPkRegime() {
        return pkRegime;
    }

    public void setPkRegime(int pkRegime) {
        this.pkRegime = pkRegime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimeControlEntity that = (TimeControlEntity) o;

        if (pkTimeContol != that.pkTimeContol) return false;
        if (minutesTimeControl != that.minutesTimeControl) return false;
        if (secondsTimeControl != that.secondsTimeControl) return false;
        if (addTimeControl != that.addTimeControl) return false;
        if (pkRegime != that.pkRegime) return false;
        if (codeTimeControl != null ? !codeTimeControl.equals(that.codeTimeControl) : that.codeTimeControl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkTimeContol;
        result = 31 * result + (codeTimeControl != null ? codeTimeControl.hashCode() : 0);
        result = 31 * result + minutesTimeControl;
        result = 31 * result + secondsTimeControl;
        result = 31 * result + addTimeControl;
        result = 31 * result + pkRegime;
        return result;
    }
}
