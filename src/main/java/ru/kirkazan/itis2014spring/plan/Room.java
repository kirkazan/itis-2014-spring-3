package ru.kirkazan.itis2014spring.plan;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Dasha
 * Date: 08.04.14
 * Time: 21:14
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Room {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    @Temporal(TemporalType.DATE)
    private Date fromActualDate;
    @Column
    @Temporal(TemporalType.DATE)
    private Date toActualDate;
    @ManyToOne
    private Pricelist pricelist;
    @ManyToOne
    private RoomType roomType;

    public Room() {
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

    public Date getFromActualDate() {
        return fromActualDate;
    }

    public void setFromActualDate(Date fromActualDate) {
        this.fromActualDate = fromActualDate;
    }

    public Date getToActualDate() {
        return toActualDate;
    }

    public void setToActualDate(Date toActualDate) {
        this.toActualDate = toActualDate;
    }

}
