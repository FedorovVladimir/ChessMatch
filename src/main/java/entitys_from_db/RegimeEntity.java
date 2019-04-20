package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "REGIME", schema = "vladimir7_chess")
public class RegimeEntity {
    private int pkRegime;
    private String codeRegime;
    private String nameRegime;

    @Id
    @Column(name = "PK_REGIME")
    public int getPkRegime() {
        return pkRegime;
    }

    public void setPkRegime(int pkRegime) {
        this.pkRegime = pkRegime;
    }

    @Basic
    @Column(name = "CODE_REGIME")
    public String getCodeRegime() {
        return codeRegime;
    }

    public void setCodeRegime(String codeRegime) {
        this.codeRegime = codeRegime;
    }

    @Basic
    @Column(name = "NAME_REGIME")
    public String getNameRegime() {
        return nameRegime;
    }

    public void setNameRegime(String nameRegime) {
        this.nameRegime = nameRegime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegimeEntity that = (RegimeEntity) o;

        if (pkRegime != that.pkRegime) return false;
        if (codeRegime != null ? !codeRegime.equals(that.codeRegime) : that.codeRegime != null) return false;
        if (nameRegime != null ? !nameRegime.equals(that.nameRegime) : that.nameRegime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkRegime;
        result = 31 * result + (codeRegime != null ? codeRegime.hashCode() : 0);
        result = 31 * result + (nameRegime != null ? nameRegime.hashCode() : 0);
        return result;
    }
}
