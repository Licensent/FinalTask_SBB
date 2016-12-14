package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.io.Serializable;

/**
 * Created by DarthVader on 11.12.2016.
 */
@Entity
@Table(name = "Passenger")
public class Passenger extends BaseEntity implements Serializable {
    @Column(name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surname;
    @Column(name = "Lastnme")
    private String lastName;
    @Column(name = "Data")
    private Data data;
    @Column(name = "Loggin")
    private String loggin;
    @Column (name = "Password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getLoggin() {
        return loggin;
    }

    public void setLoggin(String loggin) {
        this.loggin = loggin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
