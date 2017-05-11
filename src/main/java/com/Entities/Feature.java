package com.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by hicham on 02/05/2017.
 */
@Entity
public class Feature {

    private int id;
    private String content;
    private Byte state;
    private String typePerson;
    private String name;
    private Collection<Appointment> appointments;
    private Subject subject;
    private Team team;
//    private Collection<FeatureHasNotecard> featureHasNotecardsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
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
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "feature")
    public Collection<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Collection<Appointment> appointments) {
        this.appointments = appointments;
    }

    @ManyToOne
    @JoinColumn(name = "Subject_id", referencedColumnName = "id")
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subjectd) {
        this.subject = subject;
    }

    @ManyToOne
    @JoinColumn(name = "Team_id", referencedColumnName = "id")
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
