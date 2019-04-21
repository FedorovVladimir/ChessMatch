package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY", schema = "vladimir7_chess", catalog = "")
public class CountryEntity {
    private int pkCountry;
    private String codeCountry;
    private String nameCountry;

    @Id
    @Column(name = "PK_COUNTRY")
    public int getPkCountry() {
        return pkCountry;
    }

    public void setPkCountry(int pkCountry) {
        this.pkCountry = pkCountry;
    }

    @Basic
    @Column(name = "CODE_COUNTRY")
    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    @Basic
    @Column(name = "NAME_COUNTRY")
    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (pkCountry != that.pkCountry) return false;
        if (codeCountry != null ? !codeCountry.equals(that.codeCountry) : that.codeCountry != null) return false;
        if (nameCountry != null ? !nameCountry.equals(that.nameCountry) : that.nameCountry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkCountry;
        result = 31 * result + (codeCountry != null ? codeCountry.hashCode() : 0);
        result = 31 * result + (nameCountry != null ? nameCountry.hashCode() : 0);
        return result;
    }
}
