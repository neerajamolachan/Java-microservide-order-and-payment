package com.amazono.entity;

import java.util.ArrayList;
import java.util.List;


public class Order {
	private Long orderId;
	private String item;
	private String location;
	
	List<Payment> payment= new ArrayList<>();

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, String item, String location) {
		super();
		this.orderId = orderId;
		this.item = item;
		this.location = location;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}
	
	
	

}
