package com.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.dto.Order1;

import com.app.main.service.IorderService;


@RestController
public class OrderController {
	
	
	@Autowired
	IorderService orderserviceRef;



		

	@RequestMapping("/ordertest")
	public String welcomeorder() {

	return "you are in the testing phase";

	}


	@RequestMapping("/orderslist")
	public List<Order1> getallOrders(){

	return orderserviceRef.getAllOrders();
	}


	@RequestMapping("/orderslist/{oId}")
	public Order1 getordersById(@PathVariable int oId) {
	return orderserviceRef.getOrdersById(oId);
	}


	@RequestMapping(method = RequestMethod.POST,value = "/orderslist")
	public void addorder(@RequestBody Order1 order)
	{
		orderserviceRef.addOrders(order);
	}

	@RequestMapping(method = RequestMethod.PUT,value = "/orderslist/{oId}")
	public void updateUser(@RequestBody Order1 order,@PathVariable int oId)
	{
		orderserviceRef.updateOrders(order, oId);
	}

	@RequestMapping(method = RequestMethod.DELETE,value = "/orderslist/{oId}")
	public void deleteorder(@PathVariable int oId)
	{
		orderserviceRef.deleteOrders(oId);
	}
		

}
