package entitys_from_db;

import javax.persistence.*;

@Entity
@Table(name = "ECO", schema = "vladimir7_chess", catalog = "")
public class EcoEntity {
    private int pkEco;
    private String codeEco;

    @Id
    @Column(name = "PK_ECO")
    public int getPkEco() {
        return pkEco;
    }

    public void setPkEco(int pkEco) {
        this.pkEco = pkEco;
    }

    @Basic
    @Column(name = "CODE_ECO")
    public String getCodeEco() {
        return codeEco;
    }

    public void setCodeEco(String codeEco) {
        this.codeEco = codeEco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EcoEntity ecoEntity = (EcoEntity) o;

        if (pkEco != ecoEntity.pkEco) return false;
        if (codeEco != null ? !codeEco.equals(ecoEntity.codeEco) : ecoEntity.codeEco != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkEco;
        result = 31 * result + (codeEco != null ? codeEco.hashCode() : 0);
        return result;
    }
}
