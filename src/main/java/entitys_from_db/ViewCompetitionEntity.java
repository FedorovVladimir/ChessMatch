package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "VIEW_COMPETITION", schema = "vladimir7_chess")
public class ViewCompetitionEntity {
    private int pkViewCompetition;
    private String codeViewCompetition;
    private String nameViewCompetiton;

    @Id
    @Column(name = "PK_VIEW_COMPETITION")
    public int getPkViewCompetition() {
        return pkViewCompetition;
    }

    public void setPkViewCompetition(int pkViewCompetition) {
        this.pkViewCompetition = pkViewCompetition;
    }

    @Basic
    @Column(name = "CODE_VIEW_COMPETITION")
    public String getCodeViewCompetition() {
        return codeViewCompetition;
    }

    public void setCodeViewCompetition(String codeViewCompetition) {
        this.codeViewCompetition = codeViewCompetition;
    }

    @Basic
    @Column(name = "NAME_VIEW_COMPETITON")
    public String getNameViewCompetiton() {
        return nameViewCompetiton;
    }

    public void setNameViewCompetiton(String nameViewCompetiton) {
        this.nameViewCompetiton = nameViewCompetiton;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewCompetitionEntity that = (ViewCompetitionEntity) o;

        if (pkViewCompetition != that.pkViewCompetition) return false;
        if (codeViewCompetition != null ? !codeViewCompetition.equals(that.codeViewCompetition) : that.codeViewCompetition != null)
            return false;
        if (nameViewCompetiton != null ? !nameViewCompetiton.equals(that.nameViewCompetiton) : that.nameViewCompetiton != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkViewCompetition;
        result = 31 * result + (codeViewCompetition != null ? codeViewCompetition.hashCode() : 0);
        result = 31 * result + (nameViewCompetiton != null ? nameViewCompetiton.hashCode() : 0);
        return result;
    }
}
