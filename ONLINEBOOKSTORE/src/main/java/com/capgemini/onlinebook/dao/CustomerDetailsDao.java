package com.capgemini.onlinebook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinebook.entity.CustomerDetails;

public interface CustomerDetailsDao extends JpaRepository<CustomerDetails, Integer> {

}
