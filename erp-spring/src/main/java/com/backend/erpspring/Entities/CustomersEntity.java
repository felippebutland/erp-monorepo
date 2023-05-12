package com.backend.erpspring.Entities;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Customers")
public class CustomersEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
  private String name;
  private String cpf_cnpj;
  private String email;
  private String phone;
  private Date createdAt;
  private Date updatedAt;

  @OneToMany
  @JoinTable(
      name = "billing_address",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "address_id")
  )
  private List<AddressEntity> billingAddresses;

  @OneToMany
  @JoinTable(
      name = "shipping_address",
      joinColumns = @JoinColumn(name = "user_id"),
      inverseJoinColumns = @JoinColumn(name = "address_id")
  )
  private List<AddressEntity> shippingAddresses;
}
