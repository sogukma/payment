package com.pretzel.payment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private Long customerId;
	private String name;
	private String vorname;
	@OneToMany(mappedBy="customer")
	private List<Orders> orders;
	@OneToMany(mappedBy="customer")
	private List<CreditCard> creditcards;
	
	public List<CreditCard> getCreditcards() {
		return creditcards;
	}
	public void setCreditcards(List<CreditCard> creditcards) {
		this.creditcards = creditcards;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public Long getCustomerId() {
		return customerId;
	}
	
	public void addCreditcard(CreditCard cc)
	{
		this.creditcards.add(cc);
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getLoyalityPoints() {
		return loyalityPoints;
	}
	public void setLoyalityPoints(int loyalityPoints) {
		this.loyalityPoints = loyalityPoints;
	}
	private int loyalityPoints;
	
}
