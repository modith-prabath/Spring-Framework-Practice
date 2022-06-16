package com.spring.framework.practice.springmvcdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "USERINFO")
public class User {

  @Id
  private String fname;
  private String lname;

  private String email;
  private String phone;
  private String country ;

  public User() {
    // TODO document why this constructor is empty
  }

  @Override
  public String toString() {
    return "User [country=" + country + ", email=" + email + ", fname=" + fname + ", lname=" + lname + ", phone="
        + phone  + "]";
  }


  public String getFname() {
    return fname;
  }
  public void setFname(String fname) {
    this.fname = fname;
  }
  public String getLname() {
    return lname;
  }
  public void setLname(String lname) {
    this.lname = lname;
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
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  } 
  
}
