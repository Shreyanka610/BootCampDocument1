package com.capgemini.onlinebook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.onlinebook.entity.BookDetails;

public interface BookDetailsDao extends JpaRepository<BookDetails, Integer> {

}
