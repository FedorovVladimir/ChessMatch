package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "PLAYER", schema = "vladimir7_chess", catalog = "")
public class PlayerEntity {
    private int pkPlayer;
    private int pkTitleWorld;
    private String pkTitle;
    private Integer ratingNationalPlayer;
    private Integer ratingFidePlayer;
    private int pkCoeff;
    private int pkSubject;
    private int pkCountry;

    @Id
    @Column(name = "PK_PLAYER")
    public int getPkPlayer() {
        return pkPlayer;
    }

    public void setPkPlayer(int pkPlayer) {
        this.pkPlayer = pkPlayer;
    }

    @Basic
    @Column(name = "PK_TITLE_WORLD")
    public int getPkTitleWorld() {
        return pkTitleWorld;
    }

    public void setPkTitleWorld(int pkTitleWorld) {
        this.pkTitleWorld = pkTitleWorld;
    }

    @Basic
    @Column(name = "PK_TITLE")
    public String getPkTitle() {
        return pkTitle;
    }

    public void setPkTitle(String pkTitle) {
        this.pkTitle = pkTitle;
    }

    @Basic
    @Column(name = "RATING_NATIONAL_PLAYER")
    public Integer getRatingNationalPlayer() {
        return ratingNationalPlayer;
    }

    public void setRatingNationalPlayer(Integer ratingNationalPlayer) {
        this.ratingNationalPlayer = ratingNationalPlayer;
    }

    @Basic
    @Column(name = "RATING_FIDE_PLAYER")
    public Integer getRatingFidePlayer() {
        return ratingFidePlayer;
    }

    public void setRatingFidePlayer(Integer ratingFidePlayer) {
        this.ratingFidePlayer = ratingFidePlayer;
    }

    @Basic
    @Column(name = "PK_COEFF")
    public int getPkCoeff() {
        return pkCoeff;
    }

    public void setPkCoeff(int pkCoeff) {
        this.pkCoeff = pkCoeff;
    }

    @Basic
    @Column(name = "PK_SUBJECT")
    public int getPkSubject() {
        return pkSubject;
    }

    public void setPkSubject(int pkSubject) {
        this.pkSubject = pkSubject;
    }

    @Basic
    @Column(name = "PK_COUNTRY")
    public int getPkCountry() {
        return pkCountry;
    }

    public void setPkCountry(int pkCountry) {
        this.pkCountry = pkCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerEntity that = (PlayerEntity) o;

        if (pkPlayer != that.pkPlayer) return false;
        if (pkTitleWorld != that.pkTitleWorld) return false;
        if (pkCoeff != that.pkCoeff) return false;
        if (pkSubject != that.pkSubject) return false;
        if (pkCountry != that.pkCountry) return false;
        if (pkTitle != null ? !pkTitle.equals(that.pkTitle) : that.pkTitle != null) return false;
        if (ratingNationalPlayer != null ? !ratingNationalPlayer.equals(that.ratingNationalPlayer) : that.ratingNationalPlayer != null)
            return false;
        if (ratingFidePlayer != null ? !ratingFidePlayer.equals(that.ratingFidePlayer) : that.ratingFidePlayer != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkPlayer;
        result = 31 * result + pkTitleWorld;
        result = 31 * result + (pkTitle != null ? pkTitle.hashCode() : 0);
        result = 31 * result + (ratingNationalPlayer != null ? ratingNationalPlayer.hashCode() : 0);
        result = 31 * result + (ratingFidePlayer != null ? ratingFidePlayer.hashCode() : 0);
        result = 31 * result + pkCoeff;
        result = 31 * result + pkSubject;
        result = 31 * result + pkCountry;
        return result;
    }
}
