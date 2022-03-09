package com.cg.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Vui lòng nhập tên đầy đủ")
    @Size(min = 5, max = 35, message = "Kích thước tên nằm trong khoảng 5-35 ký tự")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Vui lòng nhập email")
    @Email(message = "Email không đúng định dạng", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    @NotEmpty(message = "Email không được để trống")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Số điện thoại không đúng")
    private String phone;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Ho_Chi_Minh")
    @Column(name = "birth_day")
    private Date birthDay;

    private String address;

    private int experience;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;


    @OneToOne
    @JoinColumn(name = "locationRegion_id")
    private LocationRegion locationRegion;


    @OneToOne
    @JoinColumn(name = "verification_id")
    private Verification verification;

    @Column(columnDefinition = "boolean default false")
    private boolean verified;


    public Driver() {
    }

    public Driver(Long id, String name, String email, String phone, Date birthDay, String address, int experience, User user, Car car, LocationRegion locationRegion, Verification verification, boolean verified) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDay = birthDay;
        this.address = address;
        this.experience = experience;
        this.user = user;
        this.car = car;
        this.locationRegion = locationRegion;
        this.verification = verification;
        this.verified = verified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocationRegion getLocationRegion() {
        return locationRegion;
    }

    public void setLocationRegion(LocationRegion locationRegion) {
        this.locationRegion = locationRegion;
    }

    public Verification getVerification() {
        return verification;
    }

    public void setVerification(Verification verification) {
        this.verification = verification;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
