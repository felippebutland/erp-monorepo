package com.backend.erpspring.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "role")
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERoleEntity name;

    public RoleEntity() {

    }
  
    public RoleEntity(ERoleEntity name) {
      this.name = name;
    }
}
