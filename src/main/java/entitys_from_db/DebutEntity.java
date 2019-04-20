package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "DEBUT", schema = "vladimir7_chess")
public class DebutEntity {
    private int pkDebut;
    private String nameDebut;
    private int pkEco;

    @Id
    @Column(name = "PK_DEBUT")
    public int getPkDebut() {
        return pkDebut;
    }

    public void setPkDebut(int pkDebut) {
        this.pkDebut = pkDebut;
    }

    @Basic
    @Column(name = "NAME_DEBUT")
    public String getNameDebut() {
        return nameDebut;
    }

    public void setNameDebut(String nameDebut) {
        this.nameDebut = nameDebut;
    }

    @Basic
    @Column(name = "PK_ECO")
    public int getPkEco() {
        return pkEco;
    }

    public void setPkEco(int pkEco) {
        this.pkEco = pkEco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DebutEntity that = (DebutEntity) o;

        if (pkDebut != that.pkDebut) return false;
        if (pkEco != that.pkEco) return false;
        if (nameDebut != null ? !nameDebut.equals(that.nameDebut) : that.nameDebut != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkDebut;
        result = 31 * result + (nameDebut != null ? nameDebut.hashCode() : 0);
        result = 31 * result + pkEco;
        return result;
    }
}
