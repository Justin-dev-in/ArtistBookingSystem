package com.app.main.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.main.dto.AdateAvail;
import com.app.main.dto.Order1;

@Repository("orderdao")
public interface IorderDao extends JpaRepository<Order1, Integer>{

	@Modifying
    @Query(value = "insert into order1 (booked_date,booked_time,order_price,venue,artist_artist_emailid,user_user_email) VALUES (:booked_date,:booked_time,:order_price,:venue,:artist_emailid,:user_email)", nativeQuery = true)
    @Transactional
    void addOrder(@Param("booked_date") String booked_date, @Param("booked_time") String booked_time,@Param("order_price") int order_price,@Param("venue") String venue
    		,@Param("artist_emailid") String artist_emailid,@Param("user_email") String user_email);


	@Query("select b from Artist a ,Order1 b where artist_emailid=artist_artist_emailid and artist_artist_emailid=?1")
	List<Order1> getOrderbyAemail(String email);
	
	
}

