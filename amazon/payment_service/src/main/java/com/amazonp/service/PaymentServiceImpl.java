package com.amazonp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.amazonp.entity.Payment;


@Service
public class PaymentServiceImpl implements PaymentService{
	
	List<Payment> list = List.of(
			new Payment(1L,"SBI",3633L,111L),
			new Payment(2L,"ICICI",56326L,112L),
			new Payment(3L,"HDFC",36999L,113L)
			);
	
	
	
	@Override
	public List<Payment> getPaymentOfUser(Long orderId){
		return list.stream().filter(payment -> payment.getOrderId().equals(orderId)).collect(Collectors.toList());
	}
	
}
