package com.mjv.app.model;


import com.mjv.app.enumaration.GenderType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String nationalCode;
    @Column
    private Date birthDate;
    @Column
    private GenderType gender;
    @Column
    private Boolean isActive;
    @Column
    private String phoneNumber;
    @Column
    private String idCardSer;
    @Column
    private Integer idCardNum;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdCardSer() {
        return idCardSer;
    }

    public void setIdCardSer(String idCardSer) {
        this.idCardSer = idCardSer;
    }

    public Integer getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(Integer idCardNum) {
        this.idCardNum = idCardNum;
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + nationalCode + "," + birthDate + gender + isActive + phoneNumber + "," + idCardSer + "," + idCardNum;
    }
}
