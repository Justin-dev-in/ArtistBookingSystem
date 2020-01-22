package com.app.main.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.main.dto.AdateAvail;
import com.app.main.dto.Artist;





@Repository("artistdao")
public interface IartistDao extends JpaRepository<Artist, String>{

	@Query("select a from Artist a where artistEmailID=?1 and artistPassword =?2")
	List<Artist> login(String email, String pwd);

	
	@Query("select distinct(b) from Artist a ,AdateAvail b where ?1 between  from_date and to_Date and artistfees <=?2 and artist_genre=?3")
	List<AdateAvail> checkSearch(Date date,int fees,String genre);
	
	
}


