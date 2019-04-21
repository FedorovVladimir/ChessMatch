package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "TYPE_COMPETITION", schema = "vladimir7_chess", catalog = "")
public class TypeCompetitionEntity {
    private int pkTypeCompetition;
    private String codeTypeCompetition;
    private String nameTypeCompetition;

    @Id
    @Column(name = "PK_TYPE_COMPETITION")
    public int getPkTypeCompetition() {
        return pkTypeCompetition;
    }

    public void setPkTypeCompetition(int pkTypeCompetition) {
        this.pkTypeCompetition = pkTypeCompetition;
    }

    @Basic
    @Column(name = "CODE_TYPE_COMPETITION")
    public String getCodeTypeCompetition() {
        return codeTypeCompetition;
    }

    public void setCodeTypeCompetition(String codeTypeCompetition) {
        this.codeTypeCompetition = codeTypeCompetition;
    }

    @Basic
    @Column(name = "NAME_TYPE_COMPETITION")
    public String getNameTypeCompetition() {
        return nameTypeCompetition;
    }

    public void setNameTypeCompetition(String nameTypeCompetition) {
        this.nameTypeCompetition = nameTypeCompetition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeCompetitionEntity that = (TypeCompetitionEntity) o;

        if (pkTypeCompetition != that.pkTypeCompetition) return false;
        if (codeTypeCompetition != null ? !codeTypeCompetition.equals(that.codeTypeCompetition) : that.codeTypeCompetition != null)
            return false;
        if (nameTypeCompetition != null ? !nameTypeCompetition.equals(that.nameTypeCompetition) : that.nameTypeCompetition != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkTypeCompetition;
        result = 31 * result + (codeTypeCompetition != null ? codeTypeCompetition.hashCode() : 0);
        result = 31 * result + (nameTypeCompetition != null ? nameTypeCompetition.hashCode() : 0);
        return result;
    }
}
