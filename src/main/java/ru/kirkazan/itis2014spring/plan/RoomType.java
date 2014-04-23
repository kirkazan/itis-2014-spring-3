package ru.kirkazan.itis2014spring.plan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created with IntelliJ IDEA.
 * User: Dasha
 * Date: 08.04.14
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class RoomType {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer koef;


    public RoomType() {
    }

    public RoomType(Integer id, String name, Integer koef) {
        this.id = id;
        this.name = name;
        this.koef = koef;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getKoef() {
        return koef;
    }

    public void setKoef(Integer koef) {
        this.koef = koef;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoomType roomType = (RoomType) o;

        if (id != null ? !id.equals(roomType.id) : roomType.id != null) return false;
        if (koef != null ? !koef.equals(roomType.koef) : roomType.koef != null) return false;
        if (name != null ? !name.equals(roomType.name) : roomType.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (koef != null ? koef.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", koef=" + koef +
                '}';
    }
}
