package com.backend.erpspring.Entities;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Categories")
public class Category {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
  private String name;
  private Date createdAt;
  private Date updatedAt;
}
