package com.pretzel.payment;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PaymentApplication {

	@Autowired
	private CreditCardRepository creditCardRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}
	
	@PostConstruct
	public void init()
	{
		//mocked
		Customer customer = new Customer();
		customer.setName("Müller");
		customer.setVorname("Hans");
		customer.setLoyalityPoints(20);
		customer = customerRepository.save(customer);
		
		//mocked
		
		CreditCard creditcard = new CreditCard();
		creditcard.setClearingCode(1000);
		creditcard.setCardNumber(43523435L);
	 	creditcard.setExpiryDate(new Date(2014, 6, 20, 1, 1));
		creditcard.setOwnerName("Hans Müller");
		creditcard.setCustomer(customer);
		creditcard = creditCardRepository.save(creditcard);
		
	
		Orders order = new Orders();
		//mocked
		order.setTotalCost(2000);
		//zu erstellen hier
		order.setTrackingId(2343423);
		order.setStatus("payed");
		order.setCustomer(customer);
		order = orderRepository.save(order);
		
		
		

		
	
	}

}
