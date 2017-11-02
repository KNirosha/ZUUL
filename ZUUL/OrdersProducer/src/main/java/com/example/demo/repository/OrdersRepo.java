package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Order;
@Repository
public class OrdersRepo {
	
	public List<Order> getOrders(){
		List <Order> ordersList= new ArrayList<>();
		Order order1= new Order();
		order1.setOrderNo(1234);
		order1.setPrice(234.679);
		order1.setOrderedBy("KMS");
		order1.setCreatedOn(new Date());
		ordersList.add(order1);
		return ordersList;
		
	}

}