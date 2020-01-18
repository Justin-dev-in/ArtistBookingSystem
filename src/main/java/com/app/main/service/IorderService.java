package com.app.main.service;

import java.util.List;

import com.app.main.dto.Order1;

public interface IorderService {
	
	List<Order1> getAllOrders();
	Order1 getOrdersById(int oId);
	void addOrders(Order1 order);
	void deleteOrders(int oId);
	void updateOrders(Order1 order, int oId);
	
	
}
