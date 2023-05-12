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
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Address")
public class AddressEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

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