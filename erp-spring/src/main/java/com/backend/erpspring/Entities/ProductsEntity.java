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
@Table(name = "Products")
public class ProductsEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
  private String name;
  private Float weight;
  private Float price;
  private Float cost;
  private String description;
  private Integer quantity;
  private Date createdAt;
  private Date updatedAt;
}
