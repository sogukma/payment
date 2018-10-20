package com.pretzel.payment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Orders {

	@Id
	@GeneratedValue
	private Long orderId;
	private String status;
	private int trackingId;
	private double totalCost;
	@ManyToOne
	private Customer customer; 
	
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
