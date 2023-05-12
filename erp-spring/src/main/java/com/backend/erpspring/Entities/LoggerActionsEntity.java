package com.backend.erpspring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "LoggerActions")
public class LoggerActionsEntity {
  
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
  private String name;
  private Date createdAt;
}
