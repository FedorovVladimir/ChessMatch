package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "TITLE_WORLD", schema = "vladimir7_chess")
public class TitleWorldEntity {
    private int pkTitleWorld;
    private String codeTitleWorld;
    private String nameTitleWorld;

    @Id
    @Column(name = "PK_TITLE_WORLD")
    public int getPkTitleWorld() {
        return pkTitleWorld;
    }

    public void setPkTitleWorld(int pkTitleWorld) {
        this.pkTitleWorld = pkTitleWorld;
    }

    @Basic
    @Column(name = "CODE_TITLE_WORLD")
    public String getCodeTitleWorld() {
        return codeTitleWorld;
    }

    public void setCodeTitleWorld(String codeTitleWorld) {
        this.codeTitleWorld = codeTitleWorld;
    }

    @Basic
    @Column(name = "NAME_TITLE_WORLD")
    public String getNameTitleWorld() {
        return nameTitleWorld;
    }

    public void setNameTitleWorld(String nameTitleWorld) {
        this.nameTitleWorld = nameTitleWorld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitleWorldEntity that = (TitleWorldEntity) o;

        if (pkTitleWorld != that.pkTitleWorld) return false;
        if (codeTitleWorld != null ? !codeTitleWorld.equals(that.codeTitleWorld) : that.codeTitleWorld != null)
            return false;
        if (nameTitleWorld != null ? !nameTitleWorld.equals(that.nameTitleWorld) : that.nameTitleWorld != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkTitleWorld;
        result = 31 * result + (codeTitleWorld != null ? codeTitleWorld.hashCode() : 0);
        result = 31 * result + (nameTitleWorld != null ? nameTitleWorld.hashCode() : 0);
        return result;
    }
}
