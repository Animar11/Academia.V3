package com.Entities;

import javax.persistence.*;

/**
 * Created by hicham on 02/05/2017.
 */
@Entity
public class Depositbox {
    private int id;
    private String limitDate;
    private String title;
    private Document document;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "limitDate", nullable = true, length = 45)
    public String getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(String limitDate) {
        this.limitDate = limitDate;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 45)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name = "Document_id", referencedColumnName = "id", nullable = false)
    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
