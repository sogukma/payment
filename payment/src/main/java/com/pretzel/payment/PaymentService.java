package com.pretzel.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	@Autowired
	private OrderRepository orderRepository;
	
	public void pay(double totalCost, int trackingId, CreditCard creditcard, Customer customer)
	{
		Orders order = new Orders();
		//mocked
		order.setTotalCost(totalCost);
		//zu erstellen hier
		order.setTrackingId(trackingId);
		order.setStatus("payed");
		order.setCustomer(customer);
		order.setUsedCreditCard(creditcard);
		order = orderRepository.save(order);
		
	}

}
