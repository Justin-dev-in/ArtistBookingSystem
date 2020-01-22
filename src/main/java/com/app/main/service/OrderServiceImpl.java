package com.app.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.main.dao.IorderDao;

import com.app.main.dto.Order1;

@Service
public class OrderServiceImpl implements IorderService{

	
	@Autowired
	private IorderDao odaoref;
	
	@Override
	public List<Order1> getAllOrders() {
		// TODO Auto-generated method stub
		return odaoref.findAll();
	}

	@Override
	public Order1 getOrdersById(int oId) {
		// TODO Auto-generated method stub
		return odaoref.getOne(oId);
	}

	@Override
	public void addOrders(Order1 order) {
		// TODO Auto-generated method stub
		odaoref.save(order);
	}

	@Override
	public void deleteOrders(int oId) {
		// TODO Auto-generated method stub
		odaoref.deleteById(oId);
	}

	@Override
	public void updateOrders(Order1 order, int oId) {
		// TODO Auto-generated method stub
		odaoref.save(order);
		
	}

	

}
