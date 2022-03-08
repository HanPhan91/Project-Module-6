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



}
