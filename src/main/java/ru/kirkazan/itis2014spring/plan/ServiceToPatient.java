package ru.kirkazan.itis2014spring.plan;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dasha
 * Date: 16.04.14
 * Time: 15:44
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class ServiceToPatient {
    @Id
    private Integer id;
    @Column
    @Temporal(TemporalType.DATE)
    private Date fromTime;
    @Column
    @Temporal(TemporalType.DATE)
    private Date toTime;
    @Column
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column
    private boolean state;
    @OneToMany
    private List<Patient> patientList;


    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public ServiceToPatient() {
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

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

}
