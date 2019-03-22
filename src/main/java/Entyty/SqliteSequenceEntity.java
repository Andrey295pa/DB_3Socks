package Entyty;

import javax.persistence.*;

@Entity
@Table(name = "sqlite_sequence", schema = "main", catalog = "")
public class SqliteSequenceEntity {
    private Object name;
    private Object seq;

    @Basic
    @Column(name = "name")
    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    @Basic
    @Column(name = "seq")
    public Object getSeq() {
        return seq;
    }

    public void setSeq(Object seq) {
        this.seq = seq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SqliteSequenceEntity that = (SqliteSequenceEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (seq != null ? !seq.equals(that.seq) : that.seq != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (seq != null ? seq.hashCode() : 0);
        return result;
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
