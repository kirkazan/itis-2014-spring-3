package ru.kirkazan.itis2014spring.plan;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dasha
 * Date: 08.04.14
 * Time: 21:09
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Service {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer basePrice;
    @Column
    @Temporal(TemporalType.DATE)
    private Date fromActualDate;
    @Column
    @Temporal(TemporalType.DATE)
    private Date toActualDate;


    public Service() {
    }

    public Service(Integer id, String name, Integer basePrice, Date fromActualDate, Date toActualDate, List<Patient> patientList) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
        this.fromActualDate = fromActualDate;
        this.toActualDate = toActualDate;
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

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
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




    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", basePrice=" + basePrice +
                ", fromActualDate=" + fromActualDate +
                ", toActualDate=" + toActualDate +
                '}';
    }
}
