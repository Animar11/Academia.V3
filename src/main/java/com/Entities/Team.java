package com.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by hicham on 02/05/2017.
 */
@Entity
public class Team {
    private int id;
    private Collection<Document> documents;
    private Collection<Feature> features;
    private Collection<Notecard> notecards;
    private Person person;
    private Subject subject;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @OneToMany(mappedBy = "team")
    public Collection<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(Collection<Document> documents) {
        this.documents = documents;
    }

    @OneToMany(mappedBy = "team")
    public Collection<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Collection<Feature> features) {
        this.features = features;
    }

    @OneToMany(mappedBy = "team")
    public Collection<Notecard> getNotecards() {
        return notecards;
    }

    public void setNotecards(Collection<Notecard> notecards) {
        this.notecards = notecards;
    }

    @ManyToOne
    @JoinColumn(name = "Person_id", referencedColumnName = "id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne
    @JoinColumn(name = "Subject_id", referencedColumnName = "id")
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
