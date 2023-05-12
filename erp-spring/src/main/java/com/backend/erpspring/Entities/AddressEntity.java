package com.backend.erpspring.Entities;

import java.sql.Date;
import java.util.UUID;

import com.backend.erpspring.Enums.AddressEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class AddressEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getNeighbordhood() {
    return neighbordhood;
  }

  public void setNeighbordhood(String neighbordhood) {
    this.neighbordhood = neighbordhood;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AddressEnum getType() {
    return type;
  }

  public void setType(AddressEnum type) {
    this.type = type;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  private String street;
  private String city;
  private String neighbordhood;
  private String state;
  private String country;

  @Enumerated(EnumType.ORDINAL)
  private AddressEnum type;
  
  private Date createdAt;
  private Date updatedAt;
}