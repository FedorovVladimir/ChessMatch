package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY", schema = "vladimir7_chess")
public class CategoryEntity {
    private int pkCategory;
    private String codeCategory;
    private String nameCategory;

    @Id
    @Column(name = "PK_CATEGORY")
    public int getPkCategory() {
        return pkCategory;
    }

    public void setPkCategory(int pkCategory) {
        this.pkCategory = pkCategory;
    }

    @Basic
    @Column(name = "CODE_CATEGORY")
    public String getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(String codeCategory) {
        this.codeCategory = codeCategory;
    }

    @Basic
    @Column(name = "NAME_CATEGORY")
    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (pkCategory != that.pkCategory) return false;
        if (codeCategory != null ? !codeCategory.equals(that.codeCategory) : that.codeCategory != null) return false;
        if (nameCategory != null ? !nameCategory.equals(that.nameCategory) : that.nameCategory != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkCategory;
        result = 31 * result + (codeCategory != null ? codeCategory.hashCode() : 0);
        result = 31 * result + (nameCategory != null ? nameCategory.hashCode() : 0);
        return result;
    }
}
