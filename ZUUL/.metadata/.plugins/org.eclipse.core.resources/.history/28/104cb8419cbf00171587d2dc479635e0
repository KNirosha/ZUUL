package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Order;
import com.example.demo.repository.OrdersRepo;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	public OrdersRepo repo;

	public OrdersRepo getRepo() {
		return repo;
	}

	public void setRepo(OrdersRepo repo) {
		this.repo = repo;
	}

	@Override
	public List<Order> getOrders() {
		
		return repo.getOrders();
	}

}
