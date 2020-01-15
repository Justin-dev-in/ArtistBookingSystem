package com.app.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.main.dto.Artist;




@Repository("artistdao")
public interface IartistDao extends JpaRepository<Artist, Integer>{



}


