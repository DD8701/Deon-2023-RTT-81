package com.davis.project.abcinc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer OrderId;
	private Date orderDate;
	private String productName;
	
	@ManyToMany
	@JoinColumn(name = "CustomerId")
	private Customer customer;
	
	
	public Order(Date orderDate, String productName) {
		super();
		this.orderDate = orderDate;
		this.productName = productName;
	}
	
	public Order() {}

	public Integer getOrderId() {
		return OrderId;
	}

	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", orderDate=" + orderDate + ", productName=" + productName + "]";
	}
	
	
	
	

}
