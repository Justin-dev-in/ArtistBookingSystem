package com.app.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.main.dto.Artist;





@Repository("artistdao")
public interface IartistDao extends JpaRepository<Artist, Integer>{

	@Query("select a from Artist a where artistEmailID=?1 and artistPassword =?2")
	List<Artist> login(String email, String pwd);

}


