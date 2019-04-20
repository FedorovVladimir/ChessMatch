package entitys_from_db;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SubjectEntityPK implements Serializable {
    private int pkSubject;
    private int pkCountry;

    @Column(name = "PK_SUBJECT")
    @Id
    public int getPkSubject() {
        return pkSubject;
    }

    public void setPkSubject(int pkSubject) {
        this.pkSubject = pkSubject;
    }

    @Column(name = "PK_COUNTRY")
    @Id
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

        SubjectEntityPK that = (SubjectEntityPK) o;

        if (pkSubject != that.pkSubject) return false;
        if (pkCountry != that.pkCountry) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkSubject;
        result = 31 * result + pkCountry;
        return result;
    }
}
