package com.cg.model;

import javax.persistence.*;


@Entity
@Table(name = "location_region")
public class LocationRegion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;

    @Column(name ="district_id")
    private Long districtId;

    @Column(name = "district_name")
    private String districtName;

    @Column(name = "province_id")
    private Long provinceId;

    @Column(name = "province_name")
    private String provinceName;

    @Column(name = "ward_id")
    private Long wardId;

    @Column(name = "ward_name")
    private String wardName;
}
