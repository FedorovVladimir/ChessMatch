package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "LIST_ARBITER", schema = "vladimir7_chess")
public class ListArbiterEntity {
    private int pkArbitered;
    private int fkArbiter;
    private int pkTournament;

    @Id
    @Column(name = "PK_ARBITERED")
    public int getPkArbitered() {
        return pkArbitered;
    }

    public void setPkArbitered(int pkArbitered) {
        this.pkArbitered = pkArbitered;
    }

    @Basic
    @Column(name = "FK_ARBITER")
    public int getFkArbiter() {
        return fkArbiter;
    }

    public void setFkArbiter(int fkArbiter) {
        this.fkArbiter = fkArbiter;
    }

    @Basic
    @Column(name = "PK_TOURNAMENT")
    public int getPkTournament() {
        return pkTournament;
    }

    public void setPkTournament(int pkTournament) {
        this.pkTournament = pkTournament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListArbiterEntity that = (ListArbiterEntity) o;

        if (pkArbitered != that.pkArbitered) return false;
        if (fkArbiter != that.fkArbiter) return false;
        if (pkTournament != that.pkTournament) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkArbitered;
        result = 31 * result + fkArbiter;
        result = 31 * result + pkTournament;
        return result;
    }
}
