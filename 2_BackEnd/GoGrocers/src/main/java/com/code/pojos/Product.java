package com.code.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "products")
public class Product extends BaseEntity{
	@Column(name = "product_name", length = 20)
	private String productName;
	@Column(length = 50)
	private String description;
	@Column (name = "in_stock")
	private boolean instock;
	private double price;
	@Transient
	private LocalDate expDate;
	@ManyToOne
	@JoinColumn(name="category_id",nullable = false) //to specify foreign key colm name
	@JsonIgnoreProperties("products")
	private Category productCategory;
	public Product() {
		
	}

	public Product(String productName, String description, boolean instock, double price, LocalDate expDate, Category productCategory) {
		super();
		this.productName = productName;
		this.description = description;
		this.instock = instock;
		this.price = price;
		this.expDate = expDate;
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return "Product Id="+getId()+"[productName=" + productName + ", description=" + description + ", instock=" + instock
				+ ", price=" + price + ", expDate=" + expDate + "]";
	}

	
	public Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isInstock() {
		return instock;
	}

	public void setInstock(boolean instock) {
		this.instock = instock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	
	
}
