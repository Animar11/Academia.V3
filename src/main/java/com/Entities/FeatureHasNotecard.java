//package com.Entities;
//
//import javax.persistence.*;
//
///**
// * Created by hicham on 02/05/2017.
// */
//@Entity
//@Table(name = "feature_has_notecard", schema = "academia", catalog = "")
//public class FeatureHasNotecard {
//    private Integer featureId;
//    private Integer noteCardId;
//    private int id;
//    private Feature featureByFeatureId;
//    private Notecard notecardByNoteCardId;
//
//    @Basic
//    @Column(name = "Feature_id", nullable = true)
//    public Integer getFeatureId() {
//        return featureId;
//    }
//
//    public void setFeatureId(Integer featureId) {
//        this.featureId = featureId;
//    }
//
//    @Basic
//    @Column(name = "NoteCard_id", nullable = true)
//    public Integer getNoteCardId() {
//        return noteCardId;
//    }
//
//    public void setNoteCardId(Integer noteCardId) {
//        this.noteCardId = noteCardId;
//    }
//
//    @Id
//    @Column(name = "id", nullable = false)
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        FeatureHasNotecard that = (FeatureHasNotecard) o;
//
//        if (id != that.id) return false;
//        if (featureId != null ? !featureId.equals(that.featureId) : that.featureId != null) return false;
//        if (noteCardId != null ? !noteCardId.equals(that.noteCardId) : that.noteCardId != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = featureId != null ? featureId.hashCode() : 0;
//        result = 31 * result + (noteCardId != null ? noteCardId.hashCode() : 0);
//        result = 31 * result + id;
//        return result;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "Feature_id", referencedColumnName = "id")
//    public Feature getFeatureByFeatureId() {
//        return featureByFeatureId;
//    }
//
//    public void setFeatureByFeatureId(Feature featureByFeatureId) {
//        this.featureByFeatureId = featureByFeatureId;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "NoteCard_id", referencedColumnName = "id")
//    public Notecard getNotecardByNoteCardId() {
//        return notecardByNoteCardId;
//    }
//
//    public void setNotecardByNoteCardId(Notecard notecardByNoteCardId) {
//        this.notecardByNoteCardId = notecardByNoteCardId;
//    }
//}
