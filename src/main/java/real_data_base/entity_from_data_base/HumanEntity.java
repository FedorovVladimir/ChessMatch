package real_data_base.entity_from_data_base;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "HUMAN", schema = "vladimir7_match", catalog = "")
public class HumanEntity {
    private int id;
    private String first;
    private String last;
    private String patro;
    private Date dateBorn;
    private String sex;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRST")
    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Basic
    @Column(name = "LAST")
    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Basic
    @Column(name = "PATRO")
    public String getPatro() {
        return patro;
    }

    public void setPatro(String patro) {
        this.patro = patro;
    }

    @Basic
    @Column(name = "DATE_BORN")
    public Date getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
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
        return id == that.id &&
                Objects.equals(first, that.first) &&
                Objects.equals(last, that.last) &&
                Objects.equals(patro, that.patro) &&
                Objects.equals(dateBorn, that.dateBorn) &&
                Objects.equals(sex, that.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first, last, patro, dateBorn, sex);
    }
}
