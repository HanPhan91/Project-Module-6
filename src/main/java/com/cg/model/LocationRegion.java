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

    public LocationRegion() {
    }

    public LocationRegion(Long id, String address, Long districtId, String districtName, Long provinceId, String provinceName, Long wardId, String wardName) {
        this.id = id;
        this.address = address;
        this.districtId = districtId;
        this.districtName = districtName;
        this.provinceId = provinceId;
        this.provinceName = provinceName;
        this.wardId = wardId;
        this.wardName = wardName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Long getWardId() {
        return wardId;
    }

    public void setWardId(Long wardId) {
        this.wardId = wardId;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }
}
