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
 * Time: 20:35
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Patient {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String father;



    public Patient() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFather() {
        return father;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFather(String father) {
        this.father = father;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", father='" + father + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Patient patient = (Patient) object;

        if (!father.equals(patient.father)) return false;
        if (!id.equals(patient.id)) return false;
        if (!name.equals(patient.name)) return false;
        if (!surname.equals(patient.surname)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + father.hashCode();
        return result;
    }

}
