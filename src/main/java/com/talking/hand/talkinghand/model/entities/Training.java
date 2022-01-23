package com.talking.hand.talkinghand.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Training {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainingID;
    private String trainingname;
    private String trainingdescription;
    private String traininglocation;
    private String tweek;
    private String tday;
    private String ttime;
    private String t_text;
    private String links;
    private String course;

//    @OneToMany (mappedBy = "training")
//    @JsonIgnore
//    private List<Training> items = new ArrayList<>();
//

    //the relationship with training
    @ManyToMany
    @JoinTable(
            name="hearingImpaired_train",
            joinColumns = @JoinColumn(name="trainingID"),
            inverseJoinColumns = @JoinColumn(name="hearingimpairedID")
    )
    private List<HearingImpaired>enrolledHearingImpaireds = new ArrayList<>();


    public Training() {
    }

    public Training(int trainingID, String trainingname, String trainingdescription, String traininglocation,
                    String tweek, String tday, String ttime, String t_text, String links,
                    List<HearingImpaired> enrolledHearingImpaireds, String course) {

        this.trainingID = trainingID;
        this.trainingname = trainingname;
        this.trainingdescription = trainingdescription;
        this.traininglocation = traininglocation;
        this.tweek = tweek;
        this.tday = tday;
        this.ttime = ttime;
        this.t_text = t_text;
        this.links = links;
        this.enrolledHearingImpaireds = enrolledHearingImpaireds;
        this.course = course;
    }

    public int getTrainingID() {
        return trainingID;
    }

    public void setTrainingID(int trainingID) {
        this.trainingID = trainingID;
    }

    public String getTrainingname() {
        return trainingname;
    }

    public void setTrainingname(String trainingname) {
        this.trainingname = trainingname;
    }

    public String getTrainingdescription() {
        return trainingdescription;
    }

    public void setTrainingdescription(String trainingdescription) {
        this.trainingdescription = trainingdescription;
    }

    public String getTraininglocation() {
        return traininglocation;
    }

    public void setTraininglocation(String traininglocation) {
        this.traininglocation = traininglocation;
    }

    public String getTweek() {
        return tweek;
    }

    public void setTweek(String tweek) {
        this.tweek = tweek;
    }

    public String getTday() {
        return tday;
    }

    public void setTday(String tday) {
        this.tday = tday;
    }

    public String getTtime() {
        return ttime;
    }

    public void setTtime(String ttime) {
        this.ttime = ttime;
    }

    public String getT_text() {
        return t_text;
    }

    public void setT_text(String t_text) {
        this.t_text = t_text;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public List<HearingImpaired> getEnrolledHearingImpaireds() {
        return enrolledHearingImpaireds;
    }

    public void setEnrolledHearingImpaireds(List<HearingImpaired> enrolledHearingImpaireds) {
        this.enrolledHearingImpaireds = enrolledHearingImpaireds;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
