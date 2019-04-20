package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "STRING_LIST_PLAYER", schema = "vladimir7_chess")
public class StringListPlayerEntity {
    private String pkStringListPlayer;
    private int pkPlayer;
    private int pkTournament;
    private Integer ratingStartStringList;
    private String ratingEndStringList;

    @Id
    @Column(name = "PK_STRING_LIST_PLAYER")
    public String getPkStringListPlayer() {
        return pkStringListPlayer;
    }

    public void setPkStringListPlayer(String pkStringListPlayer) {
        this.pkStringListPlayer = pkStringListPlayer;
    }

    @Basic
    @Column(name = "PK_PLAYER")
    public int getPkPlayer() {
        return pkPlayer;
    }

    public void setPkPlayer(int pkPlayer) {
        this.pkPlayer = pkPlayer;
    }

    @Basic
    @Column(name = "PK_TOURNAMENT")
    public int getPkTournament() {
        return pkTournament;
    }

    public void setPkTournament(int pkTournament) {
        this.pkTournament = pkTournament;
    }

    @Basic
    @Column(name = "RATING_START_STRING_LIST")
    public Integer getRatingStartStringList() {
        return ratingStartStringList;
    }

    public void setRatingStartStringList(Integer ratingStartStringList) {
        this.ratingStartStringList = ratingStartStringList;
    }

    @Basic
    @Column(name = "RATING_END_STRING_LIST")
    public String getRatingEndStringList() {
        return ratingEndStringList;
    }

    public void setRatingEndStringList(String ratingEndStringList) {
        this.ratingEndStringList = ratingEndStringList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringListPlayerEntity that = (StringListPlayerEntity) o;

        if (pkPlayer != that.pkPlayer) return false;
        if (pkTournament != that.pkTournament) return false;
        if (pkStringListPlayer != null ? !pkStringListPlayer.equals(that.pkStringListPlayer) : that.pkStringListPlayer != null)
            return false;
        if (ratingStartStringList != null ? !ratingStartStringList.equals(that.ratingStartStringList) : that.ratingStartStringList != null)
            return false;
        if (ratingEndStringList != null ? !ratingEndStringList.equals(that.ratingEndStringList) : that.ratingEndStringList != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkStringListPlayer != null ? pkStringListPlayer.hashCode() : 0;
        result = 31 * result + pkPlayer;
        result = 31 * result + pkTournament;
        result = 31 * result + (ratingStartStringList != null ? ratingStartStringList.hashCode() : 0);
        result = 31 * result + (ratingEndStringList != null ? ratingEndStringList.hashCode() : 0);
        return result;
    }
}
