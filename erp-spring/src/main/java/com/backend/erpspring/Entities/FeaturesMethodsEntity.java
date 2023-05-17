package com.backend.erpspring.Entities;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "FeaturesMethods")
public class FeaturesMethodsEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID id;
  private String name;
  private Date createdAt;

  public FeaturesMethodsEntity(String name) {
    this.name = name;
    this.createdAt = new Date(System.currentTimeMillis());
  }
}
