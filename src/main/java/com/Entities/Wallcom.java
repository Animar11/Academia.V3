package com.Entities;

import javax.persistence.*;

/**
 * Created by hicham on 02/05/2017.
 */
@Entity
public class Wallcom {
    private int id;
    private String content;
    private Wallmessage wallmessage;

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

    @ManyToOne
    @JoinColumn(name = "wallMessage_id", referencedColumnName = "id")
    public Wallmessage getWallmessage() {
        return wallmessage;
    }

    public void setWallmessage(Wallmessage wallmessage) {
        this.wallmessage = wallmessage;
    }
}
