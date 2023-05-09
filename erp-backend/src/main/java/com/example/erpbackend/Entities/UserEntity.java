package com.example.erpbackend.Entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class UserEntity {
    @org.springframework.data.annotation.Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserEntity orElse(Object object) {
      return null;
    }

}
