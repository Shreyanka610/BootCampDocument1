package com.capgemini.onlinebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping("/Order/{OrderId}")
	public ResponseEntity<OrderDetails> get(@PathVariable Integer OrderId){
		return new ResponseEntity<OrderDetails>(HttpStatus.OK);
		
	}
	
	/*@GetMapping("/products/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id) {
	    try {
	        Product product = service.get(id);
	        return new ResponseEntity<Product>(product, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	    }      */
	}
	
	

