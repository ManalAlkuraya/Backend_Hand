package com.talking.hand.talkinghand.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Users {
    @Id
    private String username;
    private String password;
    private String role;



//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "users")
//    @JsonManagedReference
//    private HearingImpaired hearingImpaired;

    public Users(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }



    public Users() {
    }

//    public HearingImpaired getHearingImpaired() {
//        return hearingImpaired;
//    }
//
//    public void setHearingImpaired(HearingImpaired hearingImpaired) {
//        this.hearingImpaired = hearingImpaired;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
