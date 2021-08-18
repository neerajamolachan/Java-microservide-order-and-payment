package com.amazonp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonp.entity.Payment;
import com.amazonp.service.PaymentService;



@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	
	
	@Autowired
	private PaymentService paymentService;
	@RequestMapping("/order/{OrderId}")
	public List<Payment> getContacts(@PathVariable("OrderId") Long orderId){
		return this.paymentService.getPaymentOfUser(orderId);
	}
}
