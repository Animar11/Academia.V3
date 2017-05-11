package com.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by hicham on 02/05/2017.
 */
@Entity
public class Wallmessage {
    private int id;
    private String content;
    private Collection<Wallcom> wallcoms;
    private Person person;

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

    @OneToMany(mappedBy = "wallmessage")
    public Collection<Wallcom> getWallcoms() {
        return wallcoms;
    }

    public void setWallcoms(Collection<Wallcom> wallcoms) {
        this.wallcoms = wallcoms;
    }

    @ManyToOne
    @JoinColumn(name = "Person_id", referencedColumnName = "id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
