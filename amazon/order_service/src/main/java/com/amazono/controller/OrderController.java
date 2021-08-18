package com.amazono.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amazono.entity.Order;
import com.amazono.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private RestTemplate temp;
	
	@Autowired
	private OrderService orderService;
		
	@GetMapping("/{Order_id}")
	public Order getOrder(@PathVariable("Order_id") Long orderid)
	{
		Order order = this.orderService.getOrder(orderid);
		
		List payment =this.temp.getForObject("http://localhost:9004/payment/order/"+ orderid,List.class);
		//List payment =this.temp.getForObject("http://order_service/payment/order/"+ orderid,List.class);
		order.setPayment(payment);//e
		return order;//setting contact that is there in list  
	}
	

}
