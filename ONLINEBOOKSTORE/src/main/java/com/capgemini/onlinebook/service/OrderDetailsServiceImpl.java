package com.capgemini.onlinebook.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.capgemini.onlinebook.dao.OrderDetailsDao;
import com.capgemini.onlinebook.entity.OrderDetails;
import com.capgemini.onlinebook.exception.OrderNotFoundException;

@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService
{
	@Autowired
	private OrderDetailsDao orderDetailsDao;

	
	@Override
	public OrderDetails getOrderById(Integer OrderId) {
		// TODO Auto-generated method stub
		Optional<OrderDetails> order=this.orderDetailsDao.findById(OrderId);
		if(order.isPresent())
		{
		return order.get();
		}
		else
		{
			throw new OrderNotFoundException("Record not found with id: "+OrderId);
		}
	}
}
	
	
	
     
