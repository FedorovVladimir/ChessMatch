package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "ENDGAME", schema = "vladimir7_chess", catalog = "")
public class EndgameEntity {
    private int pkEndgame;
    private String codeEndgame;
    private String nameEndgame;

    @Id
    @Column(name = "PK_ENDGAME")
    public int getPkEndgame() {
        return pkEndgame;
    }

    public void setPkEndgame(int pkEndgame) {
        this.pkEndgame = pkEndgame;
    }

    @Basic
    @Column(name = "CODE_ENDGAME")
    public String getCodeEndgame() {
        return codeEndgame;
    }

    public void setCodeEndgame(String codeEndgame) {
        this.codeEndgame = codeEndgame;
    }

    @Basic
    @Column(name = "NAME_ENDGAME")
    public String getNameEndgame() {
        return nameEndgame;
    }

    public void setNameEndgame(String nameEndgame) {
        this.nameEndgame = nameEndgame;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EndgameEntity that = (EndgameEntity) o;

        if (pkEndgame != that.pkEndgame) return false;
        if (codeEndgame != null ? !codeEndgame.equals(that.codeEndgame) : that.codeEndgame != null) return false;
        if (nameEndgame != null ? !nameEndgame.equals(that.nameEndgame) : that.nameEndgame != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkEndgame;
        result = 31 * result + (codeEndgame != null ? codeEndgame.hashCode() : 0);
        result = 31 * result + (nameEndgame != null ? nameEndgame.hashCode() : 0);
        return result;
    }
}
