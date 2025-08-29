package com.sch.sprintboot.entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Dwitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private String name;
    private String message;
    private String image;

    @Column(name="sdate", nullable = false)
    private LocalDate sdate;

    @PrePersist
    public void prePersist(){
        if(this.sdate==null){
            this.sdate = LocalDate.now();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getSdate() {
        return sdate;
    }

    public void setSdate(LocalDate sdate) {
        this.sdate = sdate;
    }
}
