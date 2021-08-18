package com.amazonp.service;

import java.util.List;

import com.amazonp.entity.Payment;


public interface PaymentService {

		public List<Payment> getPaymentOfUser(Long orderId);

}
