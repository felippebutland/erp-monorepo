package com.backend.erpspring.Entities;

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
@Entity(name = "users")
@Table(name = "users")
public class UserEntity {
    @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
