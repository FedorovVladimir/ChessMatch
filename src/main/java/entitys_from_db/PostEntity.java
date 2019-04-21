package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "POST", schema = "vladimir7_chess", catalog = "")
public class PostEntity {
    private int pkPost;
    private String codePost;
    private String namePost;

    @Id
    @Column(name = "PK_POST")
    public int getPkPost() {
        return pkPost;
    }

    public void setPkPost(int pkPost) {
        this.pkPost = pkPost;
    }

    @Basic
    @Column(name = "CODE_POST")
    public String getCodePost() {
        return codePost;
    }

    public void setCodePost(String codePost) {
        this.codePost = codePost;
    }

    @Basic
    @Column(name = "NAME_POST")
    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostEntity that = (PostEntity) o;

        if (pkPost != that.pkPost) return false;
        if (codePost != null ? !codePost.equals(that.codePost) : that.codePost != null) return false;
        if (namePost != null ? !namePost.equals(that.namePost) : that.namePost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkPost;
        result = 31 * result + (codePost != null ? codePost.hashCode() : 0);
        result = 31 * result + (namePost != null ? namePost.hashCode() : 0);
        return result;
    }
}
