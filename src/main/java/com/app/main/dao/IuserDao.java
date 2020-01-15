package com.app.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.main.dto.User;

@Repository("userdao")
public interface IuserDao extends JpaRepository<User, Integer>{



}

