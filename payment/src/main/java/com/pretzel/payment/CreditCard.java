package com.pretzel.payment;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CreditCard {

	@Id
	@GeneratedValue
	private Long cardNumber;
	private String ownerName;
	private Date expiryDate;
	private int clearingCode;
	@ManyToOne
	private Customer customer;
	@OneToMany(mappedBy="usedCreditCard")
	private List<Orders> order;
	
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getClearingCode() {
		return clearingCode;
	}
	public void setClearingCode(int clearingCode) {
		this.clearingCode = clearingCode;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	} 
}
