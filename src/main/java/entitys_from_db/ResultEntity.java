package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "RESULT", schema = "vladimir7_chess")
public class ResultEntity {
    private int pkResult;
    private String codeResult;
    private String nameResult;

    @Id
    @Column(name = "PK_RESULT")
    public int getPkResult() {
        return pkResult;
    }

    public void setPkResult(int pkResult) {
        this.pkResult = pkResult;
    }

    @Basic
    @Column(name = "CODE_RESULT")
    public String getCodeResult() {
        return codeResult;
    }

    public void setCodeResult(String codeResult) {
        this.codeResult = codeResult;
    }

    @Basic
    @Column(name = "NAME_RESULT")
    public String getNameResult() {
        return nameResult;
    }

    public void setNameResult(String nameResult) {
        this.nameResult = nameResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultEntity that = (ResultEntity) o;

        if (pkResult != that.pkResult) return false;
        if (codeResult != null ? !codeResult.equals(that.codeResult) : that.codeResult != null) return false;
        if (nameResult != null ? !nameResult.equals(that.nameResult) : that.nameResult != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkResult;
        result = 31 * result + (codeResult != null ? codeResult.hashCode() : 0);
        result = 31 * result + (nameResult != null ? nameResult.hashCode() : 0);
        return result;
    }
}
