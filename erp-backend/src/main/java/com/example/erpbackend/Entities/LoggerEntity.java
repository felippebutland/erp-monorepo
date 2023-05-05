package com.example.erpbackend.Entities;

import java.sql.Date;

import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "Logger")
public class LoggerEntity {
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getLoggerActions() {
    return loggerActions;
  }

  public void setLoggerActions(String loggerActions) {
    this.loggerActions = loggerActions;
  }

  @Id
  private Long id;
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
