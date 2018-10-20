package com.pretzel.payment;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pretzel.data.repository.CreditCardRepository;
import com.pretzel.data.repository.CustomerRepository;
import com.pretzel.data.repository.OrderRepository;
import com.pretzel.domain.Customer;
import com.pretzel.domain.Order;

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
		Customer customer = new Customer();
		customer.setName("Müller");
		customer.setVorname("Hans");
		customer.setLoyalityPoints(20);
		customer = customerRepository.save(customer);
		
		CreditCard 
		
		Order order = new Order();
		order.setCustomer(customer);
		order.setStatus("payed");
		order = orderRepository.save(order);
		
	
	}

}
