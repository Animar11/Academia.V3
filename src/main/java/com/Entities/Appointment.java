package com.Entities;

import javax.persistence.*;

/**
 * Created by hicham on 02/05/2017.
 */
@Entity
public class Appointment {
    @Id
    private int id;
    private String dateA;
    private String hStart;
    private String hEnd;
    private String content;
    private Notecard notecard;
    private Person person;
    private Comment comment;
    private Feature feature;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dateA", nullable = true, length = 45)
    public String getDateA() {
        return dateA;
    }

    public void setDateA(String dateA) {
        this.dateA = dateA;
    }

    @Basic
    @Column(name = "hStart", nullable = true, length = 45)
    public String gethStart() {
        return hStart;
    }

    public void sethStart(String hStart) {
        this.hStart = hStart;
    }

    @Basic
    @Column(name = "hEnd", nullable = true, length = 45)
    public String gethEnd() {
        return hEnd;
    }

    public void sethEnd(String hEnd) {
        this.hEnd = hEnd;
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
    @JoinColumn(name = "NoteCard_id", referencedColumnName = "id")
    //@JsonIgnore
    public Notecard getNotecard() {
        return notecard;
    }

    public void setNotecard(Notecard notecardByNoteCardId) {
        this.notecard = notecardByNoteCardId;
    }

    @ManyToOne
    @JoinColumn(name = "Person_id", referencedColumnName = "id")
    //@JsonIgnore
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne
    @JoinColumn(name = "Comment_id", referencedColumnName = "id")
   // @JsonIgnore
    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @ManyToOne
    @JoinColumn(name = "Feature_id", referencedColumnName = "id")
   // @JsonIgnore
    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature featured) {
        this.feature = feature;
    }
}
