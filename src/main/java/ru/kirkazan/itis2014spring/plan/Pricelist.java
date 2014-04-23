package ru.kirkazan.itis2014spring.plan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private Integer price;

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

    public Pricelist(Integer id, Integer price, List<Service> serviceList, List<Doctor> doctorList, List<Room> roomList, List<Request> requestsList) {
        this.id = id;
        this.price = price;
        this.serviceList = serviceList;
        this.doctorList = doctorList;
        this.roomList = roomList;
        this.requestsList = requestsList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

    @Override
    public String toString() {
        return "Pricelist{" +
                "id=" + id +
                ", price=" + price +
                ", serviceList=" + serviceList +
                ", doctorList=" + doctorList +
                ", roomList=" + roomList +
                ", requestsList=" + requestsList +
                '}';
    }
}
