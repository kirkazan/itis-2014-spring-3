package ru.kirkazan.itis2014spring.plan;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dasha
 * Date: 08.04.14
 * Time: 21:26
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Schedule {
    @Id
    private Integer id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column
    @Temporal(TemporalType.DATE)
    private Date fromActualTime;
    @Column
    @Temporal(TemporalType.DATE)
    private Date toActualTime;
    @OneToMany
    private List<Doctor> doctor;
    @OneToMany
    private List<Room> room;

    public Schedule() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
