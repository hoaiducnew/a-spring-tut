package com.example.restfulwebservices.user;

import java.util.Date;

public class User {
  private Integer id;
  private String name;
  private Date birthDate;
  
  protected User() {
    
  }

  public User(Integer id, String name, Date birthDate) {
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("User{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", birthDate=").append(birthDate);
    sb.append('}');
    return sb.toString();
  }
}
