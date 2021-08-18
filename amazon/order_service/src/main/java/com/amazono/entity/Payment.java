package com.amazono.entity;

public class Payment {
	private Long vpa;
	private String bankName  ;
	private Long amount;
	
	private Long orderId;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(Long vpa, String bankName, Long amount, Long orderId) {
		super();
		this.vpa = vpa;
		this.bankName = bankName;
		this.amount = amount;
		this.orderId = orderId;
	}

	public Long getVpa() {
		return vpa;
	}

	public void setVpa(Long vpa) {
		this.vpa = vpa;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	
}
