package com.cg.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "busy_times")
public class BusyTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rent_time")
    private Date rentTime;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "boolean default false")
    private boolean done;



}
