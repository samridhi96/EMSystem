/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sammy
 */
@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

    private String eid;
    private String name;
    private String email;
    private String dob;
    private String gender;
    private String homeAddress;
    private String phoneNo;
    private String department;
    private String salary;
    private String designation;
    private String status;

    public Employee(String id, String name, String email, String dob, String gender, String homeAddress, String phoneNo, String department, String salary, String designation, String status) {
        this.eid = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phoneNo = phoneNo;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
        this.status = status;
    }

    public Employee(String empId) {
       this.eid = empId; 
    }

   
    public String getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDepartment() {
        return department;
    }

    public String getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public String getStatus() {
        return status;
    }
    
    public void setEid(String eid) {
        this.eid = eid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
