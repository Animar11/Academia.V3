package com.Entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by hicham on 02/05/2017.
 */
@Entity
public class Document {
    private int id;
    private String depoDate;
    private String path;
    private Collection<Depositbox> depositboxes;
    private Team team;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "depoDate", nullable = true, length = 45)
    public String getDepoDate() {
        return depoDate;
    }

    public void setDepoDate(String depoDate) {
        this.depoDate = depoDate;
    }

    @Basic
    @Column(name = "path", nullable = true, length = 45)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @OneToMany(mappedBy = "document")
    public Collection<Depositbox> getDepositboxes() {
        return depositboxes;
    }

    public void setDepositboxes(Collection<Depositbox> depositboxes) {
        this.depositboxes = depositboxes;
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
