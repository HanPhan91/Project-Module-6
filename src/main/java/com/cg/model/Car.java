package com.cg.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Vui lòng nhập tên đầy đủ")
    @Size(min = 5, max = 35, message = "Kích thước tên nằm trong khoảng 5-35 ký tự")
    private String year;

    @NotBlank(message = "Vui lòng nhập tên đầy đủ")
    @Size(min = 5, max = 35, message = "Kích thước tên nằm trong khoảng 5-35 ký tự")
    @Column(name = "manufacturer")
    private String manufacturer;

    @NotBlank(message = "Vui lòng nhập tên đầy đủ")
    @Size(min = 5, max = 35, message = "Kích thước tên nằm trong khoảng 5-35 ký tự")
    private String model;

    @NotBlank(message = "Vui lòng nhập tên đầy đủ")
    @Size(min = 5, max = 35, message = "Kích thước tên nằm trong khoảng 5-35 ký tự")
    @Column(name = "license_plate")
    private String licensePlate;

    public Car(Long id) {
        this.id = id;
    }

    public Car(Long id, String year, String manufacturer, String model, String licensePlate) {
        this.id = id;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
