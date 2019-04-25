package real_data_base.entity_from_data_base;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ARBITER", schema = "vladimir7_match", catalog = "")
public class ArbiterEntity {
    private int id;

    private HumanEntity human;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HumanEntity getHuman() {
        return human;
    }

    public void setHuman(HumanEntity human) {
        this.human = human;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArbiterEntity that = (ArbiterEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
