package com.example.erpbackend.Entities;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.JoinTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProfilesFeatures")
public class ProfilesFeaturesEntity {
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
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

  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public String getFeatureId() {
    return featureId;
  }

  public void setFeatureId(String featureId) {
    this.featureId = featureId;
  }
  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID id;
  private Date createdAt;
  private Date updatedAt;

  @OneToMany
    @JoinTable(
        name = "Profiles",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
  private String profileId;

  @OneToMany
    @JoinTable(
        name = "Features",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
  private String featureId;
  
}
