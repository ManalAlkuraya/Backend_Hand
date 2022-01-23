package com.talking.hand.talkinghand.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table
public class Employee {
    @Id
    private int employeeId;
    private String name;
    private String phonenumber;
    private String email;

    //users table
    @OneToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private Users users;


    public Employee(int employeeId, String name, String phonenumber, String email, Users users) {
        this.employeeId = employeeId;
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
        this.users = users;
    }

    public Employee() {

    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
