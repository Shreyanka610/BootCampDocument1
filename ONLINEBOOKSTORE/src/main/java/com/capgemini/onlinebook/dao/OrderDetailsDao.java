package com.capgemini.onlinebook.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.onlinebook.entity.OrderDetails;

public interface OrderDetailsDao extends JpaRepository<OrderDetails, Integer> {

	
}


