package ru.kirkazan.itis2014spring.plan;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dasha
 * Date: 08.04.14
 * Time: 20:53
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Doctor {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String father;
    @Column
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @ManyToOne
    private DegreeDoctor degreeDoctor;


    public Doctor() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Date getfromDate() {
        return fromDate;
    }

    public void setfromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date gettoDate() {
        return toDate;
    }

    public void settoDate(Date toDate) {
        this.toDate = toDate;
    }


}
