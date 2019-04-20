package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "COEFF", schema = "vladimir7_chess")
public class CoeffEntity {
    private int pkCoeff;
    private String codeCoeff;

    @Id
    @Column(name = "PK_COEFF")
    public int getPkCoeff() {
        return pkCoeff;
    }

    public void setPkCoeff(int pkCoeff) {
        this.pkCoeff = pkCoeff;
    }

    @Basic
    @Column(name = "CODE_COEFF")
    public String getCodeCoeff() {
        return codeCoeff;
    }

    public void setCodeCoeff(String codeCoeff) {
        this.codeCoeff = codeCoeff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoeffEntity that = (CoeffEntity) o;

        if (pkCoeff != that.pkCoeff) return false;
        if (codeCoeff != null ? !codeCoeff.equals(that.codeCoeff) : that.codeCoeff != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkCoeff;
        result = 31 * result + (codeCoeff != null ? codeCoeff.hashCode() : 0);
        return result;
    }
}
