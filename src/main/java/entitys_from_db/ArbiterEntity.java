package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "ARBITER", schema = "vladimir7_chess", catalog = "")
public class ArbiterEntity {
    private int pkArbiter;
    private int pkCategory;
    private int pkPost;

    @Id
    @Column(name = "PK_ARBITER")
    public int getPkArbiter() {
        return pkArbiter;
    }

    public void setPkArbiter(int pkArbiter) {
        this.pkArbiter = pkArbiter;
    }

    @Basic
    @Column(name = "PK_CATEGORY")
    public int getPkCategory() {
        return pkCategory;
    }

    public void setPkCategory(int pkCategory) {
        this.pkCategory = pkCategory;
    }

    @Basic
    @Column(name = "PK_POST")
    public int getPkPost() {
        return pkPost;
    }

    public void setPkPost(int pkPost) {
        this.pkPost = pkPost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArbiterEntity that = (ArbiterEntity) o;

        if (pkArbiter != that.pkArbiter) return false;
        if (pkCategory != that.pkCategory) return false;
        if (pkPost != that.pkPost) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkArbiter;
        result = 31 * result + pkCategory;
        result = 31 * result + pkPost;
        return result;
    }
}
