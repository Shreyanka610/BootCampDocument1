package com.capgemini.onlinebook.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.onlinebook.dao.OrderDetailsDao;
import com.capgemini.onlinebook.entity.OrderDetails;

@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService
{
	@Autowired
	private OrderDetailsDao orderDetailsDao;

	@Override
	public Optional<OrderDetails> findById(Integer OrderId) {
		
		return orderDetailsDao.findById(OrderId) ;
	}


}
