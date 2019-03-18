package Entyty;

import javax.persistence.*;

@Entity
@Table(name = "Socks", schema = "main", catalog = "")
public class SocksEntity {
    private Short id;
    private Object size;
    private Object colour;

    @Id
    @Column(name = "id")
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "size")
    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    @Basic
    @Column(name = "colour")
    public Object getColour() {
        return colour;
    }

    public void setColour(Object colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SocksEntity that = (SocksEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (colour != null ? !colour.equals(that.colour) : that.colour != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        return result;
    }
}
