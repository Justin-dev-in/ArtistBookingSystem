package com.app.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.app.main.dto.Order1;

@Repository("orderdao")
public interface IorderDao extends JpaRepository<Order1, Integer>{

	

}

