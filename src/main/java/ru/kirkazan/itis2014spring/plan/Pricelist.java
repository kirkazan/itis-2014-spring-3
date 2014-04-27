package ru.kirkazan.itis2014spring.plan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * User: Dasha
 * Date: 08.04.14
 * Time: 21:32
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Pricelist {
    @Id
    private Integer id;
    @Column
    private BigDecimal price;

    @OneToMany
    private List<Service> serviceList;

    @OneToMany
    private List<Doctor> doctorList;

    @OneToMany
    private List<Room> roomList;

    @OneToMany
    private List<Request> requestsList;
    @OneToMany
    private List<ServiceToPatient> serviceToPatientsList;

    public Pricelist() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<ServiceToPatient> getServiceToPatientsList() {
        return serviceToPatientsList;
    }

    public void setServiceToPatientsList(List<ServiceToPatient> serviceToPatientsList) {
        this.serviceToPatientsList = serviceToPatientsList;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public List<Request> getRequestsList() {
        return requestsList;
    }

    public void setRequestsList(List<Request> requestsList) {
        this.requestsList = requestsList;
    }

}
