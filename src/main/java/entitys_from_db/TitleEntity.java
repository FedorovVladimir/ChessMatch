package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "TITLE", schema = "vladimir7_chess", catalog = "")
public class TitleEntity {
    private String pkTitle;
    private String codeTitle;
    private String nameTitle;
    private int pkCountry;

    @Id
    @Column(name = "PK_TITLE")
    public String getPkTitle() {
        return pkTitle;
    }

    public void setPkTitle(String pkTitle) {
        this.pkTitle = pkTitle;
    }

    @Basic
    @Column(name = "CODE_TITLE")
    public String getCodeTitle() {
        return codeTitle;
    }

    public void setCodeTitle(String codeTitle) {
        this.codeTitle = codeTitle;
    }

    @Basic
    @Column(name = "NAME_TITLE")
    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    @Basic
    @Column(name = "PK_COUNTRY")
    public int getPkCountry() {
        return pkCountry;
    }

    public void setPkCountry(int pkCountry) {
        this.pkCountry = pkCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitleEntity that = (TitleEntity) o;

        if (pkCountry != that.pkCountry) return false;
        if (pkTitle != null ? !pkTitle.equals(that.pkTitle) : that.pkTitle != null) return false;
        if (codeTitle != null ? !codeTitle.equals(that.codeTitle) : that.codeTitle != null) return false;
        if (nameTitle != null ? !nameTitle.equals(that.nameTitle) : that.nameTitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkTitle != null ? pkTitle.hashCode() : 0;
        result = 31 * result + (codeTitle != null ? codeTitle.hashCode() : 0);
        result = 31 * result + (nameTitle != null ? nameTitle.hashCode() : 0);
        result = 31 * result + pkCountry;
        return result;
    }
}
