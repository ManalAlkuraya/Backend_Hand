package com.talking.hand.talkinghand.model.entities;


import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@CrossOrigin(origins = "http://localhost:3000")
public class Serv {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)  // automatic
    private int serviceID;
    //private int nationalId;
    private String servicetypetranslator;
    private String servicetypelawyer;
    private String servicetypedoctor;
    private String laoction;
    private String date;
    private String time;
    private String connectAs;
    private String email;
    private String delivery;
    private String adtex;
    private String appointment;


    //many to many HearingImpaired
//   @ManyToMany(mappedBy = "enrolledServ")
//    private List<HearingImpaired> HearingImpaireds = new ArrayList<>();

    @ManyToMany //the relationship with HearingImpaired
    @JoinTable(
            name="hearingImpaired_serv",
            joinColumns = @JoinColumn(name="serviceID"),
            inverseJoinColumns = @JoinColumn(name="hearingimpairedID")
    )
    private List<HearingImpaired>enrolledHearingImpaired=new ArrayList<>();

    public Serv() {
    }

    // relationShip with hearing_impaired many to many


    public Serv(int serviceID, int nationalId, String servicetypetranslator, String servicetypelawyer, String servicetypedoctor ,
                String laoction, String date, String time, String connectAs, String email,
                String delivery,String adtex, String appointment, List<HearingImpaired>enrolledHearingImpaired) {//List<HearingImpaired> HearingImpaireds
        this.serviceID = serviceID;
       // this.nationalId = nationalId;
        this.servicetypetranslator = servicetypetranslator;
        this.servicetypelawyer = servicetypelawyer;
        this.servicetypedoctor = servicetypedoctor;
        this.laoction = laoction;
        this.date = date;
        this.time = time;
        this.connectAs = connectAs;
        this.email = email;
        this.delivery = delivery;
        this.adtex = adtex;
        this.appointment = appointment;
        this.enrolledHearingImpaired=enrolledHearingImpaired;
    }

    public List<HearingImpaired> getEnrolledHearingImpaired() {
        return enrolledHearingImpaired;
    }

    public void setEnrolledHearingImpaired(List<HearingImpaired> enrolledHearingImpaired) {
        this.enrolledHearingImpaired = enrolledHearingImpaired;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    //    public int getNationalId() {
//        return nationalId;
//    }
//
//    public void setNationalId(int nationalId) {
//        this.nationalId = nationalId;
//    }

    public String getServicetypetranslator() {
        return servicetypetranslator;
    }

    public void setServicetypetranslator(String servicetypetranslator) {
        this.servicetypetranslator = servicetypetranslator;
    }

    public String getServicetypelawyer() {
        return servicetypelawyer;
    }

    public void setServicetypelawyer(String servicetypelawyer) {
        this.servicetypelawyer = servicetypelawyer;
    }

    public String getServicetypedoctor() {
        return servicetypedoctor;
    }

    public void setServicetypedoctor(String servicetypedoctor) {
        this.servicetypedoctor = servicetypedoctor;
    }

    public String getLaoction() {
        return laoction;
    }

    public void setLaoction(String laoction) {
        this.laoction = laoction;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConnectAs() {
        return connectAs;
    }

    public void setConnectAs(String connectAs) {
        this.connectAs = connectAs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getAdtex() {
        return adtex;
    }

    public void setAdtex(String adtex) {
        this.adtex = adtex;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
