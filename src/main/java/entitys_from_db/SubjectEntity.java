package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "SUBJECT", schema = "vladimir7_chess", catalog = "")
@IdClass(SubjectEntityPK.class)
public class SubjectEntity {
    private int pkSubject;
    private String codeSubject;
    private String nameSubject;
    private int pkCountry;

    @Id
    @Column(name = "PK_SUBJECT")
    public int getPkSubject() {
        return pkSubject;
    }

    public void setPkSubject(int pkSubject) {
        this.pkSubject = pkSubject;
    }

    @Basic
    @Column(name = "CODE_SUBJECT")
    public String getCodeSubject() {
        return codeSubject;
    }

    public void setCodeSubject(String codeSubject) {
        this.codeSubject = codeSubject;
    }

    @Basic
    @Column(name = "NAME_SUBJECT")
    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    @Id
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

        SubjectEntity that = (SubjectEntity) o;

        if (pkSubject != that.pkSubject) return false;
        if (pkCountry != that.pkCountry) return false;
        if (codeSubject != null ? !codeSubject.equals(that.codeSubject) : that.codeSubject != null) return false;
        if (nameSubject != null ? !nameSubject.equals(that.nameSubject) : that.nameSubject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkSubject;
        result = 31 * result + (codeSubject != null ? codeSubject.hashCode() : 0);
        result = 31 * result + (nameSubject != null ? nameSubject.hashCode() : 0);
        result = 31 * result + pkCountry;
        return result;
    }
}
