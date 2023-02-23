package com.code.pojos;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders_tbl")
public class Order extends BaseEntity{
    //order_id,total_price,
	//payment_method,delivery_address,order_date,delivered_date,status,order_customer_id,
	
	private double price;
	private PaymentMethod payment;
	private String delivery_address;
	private LocalDate order_date;
	private LocalDate delivered_date;
	private boolean status;
	@ManyToOne
	@JoinColumn(name = "customer_id",nullable = false)
	private User customer; 
}
