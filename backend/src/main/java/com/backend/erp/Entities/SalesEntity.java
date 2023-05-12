package com.backend.erp.Entities;

import java.sql.Date;
import java.util.UUID;

import com.backend.erp.Enums.PaymentEnum;
import com.backend.erp.Enums.PaymentStatusEnum;
import com.backend.erp.Enums.ShippingStatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Sales")
public class SalesEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID id;
  private Date saleDate;
  private Float totalAmount;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Date getSaleDate() {
    return saleDate;
  }

  public void setSaleDate(Date saleDate) {
    this.saleDate = saleDate;
  }

  public Float getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Float totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Float getSubTotalAmount() {
    return subTotalAmount;
  }

  public void setSubTotalAmount(Float subTotalAmount) {
    this.subTotalAmount = subTotalAmount;
  }

  public Float getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Float taxAmount) {
    this.taxAmount = taxAmount;
  }

  public Float getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Float discountAmount) {
    this.discountAmount = discountAmount;
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

  public PaymentEnum getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public ShippingStatusEnum getShippingStatus() {
    return shippingStatus;
  }

  public void setShippingStatus(ShippingStatusEnum shippingStatus) {
    this.shippingStatus = shippingStatus;
  }

  private Float subTotalAmount;
  private Float taxAmount;
  private Float discountAmount;
  private Date createdAt;
  private Date updatedAt;

  @Enumerated(EnumType.ORDINAL)
  private PaymentEnum paymentMethod;

  @Enumerated(EnumType.ORDINAL)
  private PaymentStatusEnum paymentStatus;

  @Enumerated(EnumType.ORDINAL)
  private ShippingStatusEnum shippingStatus;
}
