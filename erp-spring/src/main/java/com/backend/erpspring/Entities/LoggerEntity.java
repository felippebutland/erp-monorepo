package com.backend.erpspring.Entities;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getter
@Setter
@Entity
@Table(name = "Logger")
public class LoggerEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
  private Date createdAt;
  private String ipAddress;
  private String message;

  @ManyToMany
    @JoinTable(
        name = "User",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
  private String userId;

  @ManyToMany
    @JoinTable(
        name = "LoggerActions",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
  private String loggerActions;  
}
