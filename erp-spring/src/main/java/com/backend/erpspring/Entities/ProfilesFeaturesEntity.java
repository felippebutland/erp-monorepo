package com.backend.erpspring.Entities;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ProfilesFeatures")
public class ProfilesFeaturesEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private Date createdAt;
  private Date updatedAt;

  @ManyToOne
  @JoinColumn(name = "profile_id")
  private ProfilesEntity profile;

  @ManyToOne
  @JoinColumn(name = "feature_id")
  private FeaturesEntity feature;  


  public ProfilesFeaturesEntity(ProfilesEntity profile, FeaturesEntity feature) {
    this.profile = profile;
    this.feature = feature;
    this.createdAt = new Date(System.currentTimeMillis());
    this.updatedAt = new Date(System.currentTimeMillis()); // Assuming you also want to set updatedAt when creating a new entity
  }
}
