package com.amazono.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amazono.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

		List<Order> list = List.of(
				new Order(111L,"Hp Pavillion","kannur"),
				new Order(112L,"Speaker","kozhikode"),
				new Order(113L,"iPhone","kollam")
				);
		
		@Override
		public Order getOrder(Long Id) {
			return this.list.stream().filter(order-> order.getOrderId().equals(Id)).findAny().orElse(null);
		}
				
}
