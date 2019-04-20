package entitys_from_db;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "HUMAN", schema = "vladimir7_chess")
public class HumanEntity {
    private int pkHuman;
    private String firstNameWorker;
    private String lastNameWorker;
    private Date dateBornHuman;
    private String sex;

    @Id
    @Column(name = "PK_HUMAN")
    public int getPkHuman() {
        return pkHuman;
    }

    public void setPkHuman(int pkHuman) {
        this.pkHuman = pkHuman;
    }

    @Basic
    @Column(name = "FIRST_NAME_WORKER")
    public String getFirstNameWorker() {
        return firstNameWorker;
    }

    public void setFirstNameWorker(String firstNameWorker) {
        this.firstNameWorker = firstNameWorker;
    }

    @Basic
    @Column(name = "LAST_NAME_WORKER")
    public String getLastNameWorker() {
        return lastNameWorker;
    }

    public void setLastNameWorker(String lastNameWorker) {
        this.lastNameWorker = lastNameWorker;
    }

    @Basic
    @Column(name = "DATE_BORN_HUMAN")
    public Date getDateBornHuman() {
        return dateBornHuman;
    }

    public void setDateBornHuman(Date dateBornHuman) {
        this.dateBornHuman = dateBornHuman;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HumanEntity that = (HumanEntity) o;

        if (pkHuman != that.pkHuman) return false;
        if (firstNameWorker != null ? !firstNameWorker.equals(that.firstNameWorker) : that.firstNameWorker != null)
            return false;
        if (lastNameWorker != null ? !lastNameWorker.equals(that.lastNameWorker) : that.lastNameWorker != null)
            return false;
        if (dateBornHuman != null ? !dateBornHuman.equals(that.dateBornHuman) : that.dateBornHuman != null)
            return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkHuman;
        result = 31 * result + (firstNameWorker != null ? firstNameWorker.hashCode() : 0);
        result = 31 * result + (lastNameWorker != null ? lastNameWorker.hashCode() : 0);
        result = 31 * result + (dateBornHuman != null ? dateBornHuman.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }
}
