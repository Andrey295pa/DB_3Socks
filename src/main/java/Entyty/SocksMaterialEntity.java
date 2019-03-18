package Entyty;

import javax.persistence.*;

@Entity
@Table(name = "SocksMaterial", schema = "main", catalog = "")
public class SocksMaterialEntity {
    private Short id;
    private short percentage;
    private MaterialEntity materialByMaterial;
    private ManufactureEntity manufactureByManufacture;

    @Id
    @Column(name = "id")
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "percentage_")
    public short getPercentage() {
        return percentage;
    }

    public void setPercentage(short percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SocksMaterialEntity that = (SocksMaterialEntity) o;

        if (percentage != that.percentage) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (int) percentage;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "material", referencedColumnName = "id", nullable = false)
    public MaterialEntity getMaterialByMaterial() {
        return materialByMaterial;
    }

    public void setMaterialByMaterial(MaterialEntity materialByMaterial) {
        this.materialByMaterial = materialByMaterial;
    }

    @ManyToOne
    @JoinColumn(name = "manufacture", referencedColumnName = "id", nullable = false)
    public ManufactureEntity getManufactureByManufacture() {
        return manufactureByManufacture;
    }

    public void setManufactureByManufacture(ManufactureEntity manufactureByManufacture) {
        this.manufactureByManufacture = manufactureByManufacture;
    }
}
