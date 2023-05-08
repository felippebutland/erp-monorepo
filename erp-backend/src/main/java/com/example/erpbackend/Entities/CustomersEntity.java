package com.example.erpbackend.Entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class CustomersEntity {
  @Id
  private Long id;
  private String name;
  private String cpf_cnpj;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf_cnpj() {
    return cpf_cnpj;
  }

  public void setCpf_cnpj(String cpf_cnpj) {
    this.cpf_cnpj = cpf_cnpj;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
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

  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }

  public String getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  private String email;
  private String phone;
  private Date createdAt;
  private Date updatedAt;

  @OneToMany
    @JoinTable(
        name = "Addresses",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
  private String billingAddress;

  @OneToMany
    @JoinTable(
        name = "Addresses",
        joinColumns = @JoinColumn(name = "id"),
        inverseJoinColumns = @JoinColumn(name = "id")
    )
  private String shippingAddress;
}