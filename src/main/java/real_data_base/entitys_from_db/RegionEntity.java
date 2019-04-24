package real_data_base.entitys_from_db;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REGION", schema = "vladimir7_match", catalog = "")
public class RegionEntity {
    private int id;
    private String name;
    private String code;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionEntity that = (RegionEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code);
    }
}
