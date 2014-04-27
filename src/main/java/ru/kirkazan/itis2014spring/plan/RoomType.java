package ru.kirkazan.itis2014spring.plan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

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
    private BigDecimal koef;


    public RoomType() {
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

    public BigDecimal getKoef() {
        return koef;
    }

    public void setKoef(BigDecimal koef) {
        this.koef = koef;
    }
}
