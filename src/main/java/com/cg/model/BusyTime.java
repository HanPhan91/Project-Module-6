package com.cg.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "busy_times")
public class BusyTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rent_time")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Ho_Chi_Minh")
    private Date rentTime;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "boolean default false")
    private boolean done;

    public BusyTime() {
    }

    public BusyTime(Long id, Date rentTime, String description, boolean done) {
        this.id = id;
        this.rentTime = rentTime;
        this.description = description;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRentTime() {
        return rentTime;
    }

    public void setRentTime(Date rentTime) {
        this.rentTime = rentTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
