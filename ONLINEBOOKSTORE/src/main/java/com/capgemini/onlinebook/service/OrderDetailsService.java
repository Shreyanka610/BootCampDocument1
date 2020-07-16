package com.capgemini.onlinebook.service;

import java.util.Optional;

import com.capgemini.onlinebook.entity.OrderDetails;
public interface OrderDetailsService
{
	Optional <OrderDetails> findById(Integer OrderId);
}

	


