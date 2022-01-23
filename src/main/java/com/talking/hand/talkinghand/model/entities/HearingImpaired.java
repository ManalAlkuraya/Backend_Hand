package com.talking.hand.talkinghand.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "hearingimpairedID")
public class HearingImpaired {
    @Id
    @Column(name ="hearingimpairedID" )
        private int hearingimpairedID;
        private String fullname;
        private String phonenumber;
        private String email;
        private int age;

//        @ManyToMany //the relationship with serv
//        @JoinTable(
//                name="hearingImpaired_serv",
//                joinColumns = @JoinColumn(name="hearingimpairedID"),
//                inverseJoinColumns = @JoinColumn(name="serviceID")
//        )
//        private List<Serv>enrolledServ=new ArrayList<>();

        //Training
//        @ManyToOne //*
//        @JoinColumn(name = "trainingID",referencedColumnName="trainingID") //*
//        private Training training; //*

   // many to many serv
   @ManyToMany(mappedBy = "enrolledHearingImpaired")
    private List<Serv> Servs = new ArrayList<>();

     // users table
//    @OneToOne
//    @JoinColumn(name = "username", referencedColumnName = "username")
//    private Users users;
     //many to many HearingImpaired
     @ManyToMany(mappedBy = "enrolledHearingImpaireds")
     private List<Training> trainings = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private Users users;

    public HearingImpaired() {
    }

    public HearingImpaired(int hearingimpairedID, String fullname, String phonenumber, String email, int age,
                           Users users, List<Serv>enrolledServ) {
        this.hearingimpairedID = hearingimpairedID;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
        this.email = email;
        this.age = age;
        this.users = users;
       // this.enrolledServ = enrolledServ;
    }

    //    public HearingImpaired(int hearingimpairedID, String fullname, String phonenumber, String email,
//                           int age,List<Serv> enrolledServ, List<Training>enrolledTraining ) {
//        this.hearingimpairedID = hearingimpairedID;
//        this.fullname = fullname;
//        this.phonenumber = phonenumber;
//        this.email = email;
//        this.age = age;
////        this.enrolledServ=enrolledServ;
//        this.enrolledTraining = enrolledTraining;
//       // this.training = training;
//    }
//    //one to many relationship with table training
//    public Training getTraining() {
//        return training;
//    }
//
//    public void setTraining(Training training) {
//        this.training = training;
//    }

    //many to many relationship with table Serv .. "enrolledServ"
//    public List<Serv> getEnrolledServ() {
//        return enrolledServ;
//    }
//
//    public void setEnrolledServ(List<Serv> enrolledServ) {
//        this.enrolledServ = enrolledServ;
//    }


//    public List<Serv> getEnrolledServ() {
//        return enrolledServ;
//    }
//
//    public void setEnrolledServ(List<Serv> enrolledServ) {
//        this.enrolledServ = enrolledServ;
//    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public int getHearingimpairedID() {
        return hearingimpairedID;
    }

    public void setHearingimpairedID(int hearingimpairedID) {
        this.hearingimpairedID = hearingimpairedID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
