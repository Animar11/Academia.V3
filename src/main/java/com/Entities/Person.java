package com.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by hicham on 02/05/2017.
 */
@Entity
@Access(AccessType.PROPERTY)
public class Person {

    @Id
    private int id;
    private String dateYear;
    private String login;
    private String typePerson;
    private String speciality;
    private String name;
    private Collection<Appointment> appointments;
    private Collection<Notecard> notecards;
    private Collection<Team> teams;
    private Collection<Wallmessage> wallmessages;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dateYear", nullable = true, length = 45)
    public String getDateYear() {
        return dateYear;
    }

    public void setDateYear(String dateYear) {
        this.dateYear = dateYear;
    }

    @Basic
    @Column(name = "login", nullable = true, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "typePerson", nullable = true, length = 45)
    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    @Basic
    @Column(name = "speciality", nullable = true, length = 45)
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "person")
    //@JsonIgnore
    public Collection<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Collection<Appointment> appointments) {
        this.appointments = appointments;
    }

    @OneToMany(mappedBy = "person")
    //@JsonIgnore
    public Collection<Notecard> getNotecards() {
        return notecards;
    }

    public void setNotecards(Collection<Notecard> notecards) {
        this.notecards = notecards;
    }

    @OneToMany(mappedBy = "person")
    //@JsonIgnore
    public Collection<Team> getTeams() {
        return teams;
    }

    public void setTeams(Collection<Team> teams) {
        this.teams = teams;
    }

    @OneToMany(mappedBy = "person")
    //@JsonIgnore
    public Collection<Wallmessage> getWallmessages() {
        return wallmessages;
    }

    public void setWallmessages(Collection<Wallmessage> wallmessages) {
        this.wallmessages = wallmessages;
    }
}
