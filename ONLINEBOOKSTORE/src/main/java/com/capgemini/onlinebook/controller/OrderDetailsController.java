package com.capgemini.onlinebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.onlinebook.entity.OrderDetails;
import com.capgemini.onlinebook.service.OrderDetailsService;

@CrossOrigin(origins="http://localhost:4200")
@RestController

	public class OrderDetailsController
	{
	
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@GetMapping("/orders/{OrderId}")
	public ResponseEntity<OrderDetails> getOrderById(@PathVariable Integer OrderId){
		return ResponseEntity.ok().body(orderDetailsService.getOrderById(OrderId));
	}
	
	
	
	

	}