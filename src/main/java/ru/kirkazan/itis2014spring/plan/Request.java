package ru.kirkazan.itis2014spring.plan;

import javax.persistence.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dasha
 * Date: 08.04.14
 * Time: 21:04
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Request {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String father;
    @Column
    private Integer number;
    @Column
    private String comment;
    @Column
    private Boolean state;

    public Request() {
    }

    public Request(Integer id, String name, String surname, String father, Integer number, String comment, Boolean state, List<Pricelist> pricelistsList) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.father = father;
        this.number = number;
        this.comment = comment;
        this.state = state;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", father='" + father + '\'' +
                ", number=" + number +
                ", comment='" + comment + '\'' +
                ", state=" + state  +
                '}';
    }
}
