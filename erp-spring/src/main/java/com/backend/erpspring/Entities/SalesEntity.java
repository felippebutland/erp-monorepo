package com.backend.erpspring.Entities;

import java.sql.Date;
import java.util.UUID;

import com.backend.erpspring.Enums.PaymentEnum;
import com.backend.erpspring.Enums.PaymentStatusEnum;
import com.backend.erpspring.Enums.ShippingStatusEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Sales")
public class SalesEntity {
  @Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
  private Date saleDate;
  private Float totalAmount;
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
