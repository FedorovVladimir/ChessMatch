package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "SYSTEM", schema = "vladimir7_chess", catalog = "")
public class SystemEntity {
    private int pkSystem;
    private String codeSystem;

    @Id
    @Column(name = "PK_SYSTEM")
    public int getPkSystem() {
        return pkSystem;
    }

    public void setPkSystem(int pkSystem) {
        this.pkSystem = pkSystem;
    }

    @Basic
    @Column(name = "CODE_SYSTEM")
    public String getCodeSystem() {
        return codeSystem;
    }

    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemEntity that = (SystemEntity) o;

        if (pkSystem != that.pkSystem) return false;
        if (codeSystem != null ? !codeSystem.equals(that.codeSystem) : that.codeSystem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkSystem;
        result = 31 * result + (codeSystem != null ? codeSystem.hashCode() : 0);
        return result;
    }
}
