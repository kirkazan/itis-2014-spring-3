package ru.kirkazan.itis2014spring.plan;

import javax.persistence.*;
import java.math.BigDecimal;
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
    private BigDecimal basePrice;
    @Column
    @Temporal(TemporalType.DATE)
    private Date fromActualDate;
    @Column
    @Temporal(TemporalType.DATE)
    private Date toActualDate;
    @ManyToOne
    private Profile profile;


    public Service() {
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

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
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

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
