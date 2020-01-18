package com.app.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.main.dao.IartistDao;

import com.app.main.dto.Artist;
@Service
public class ArtistServiceImpl implements IartistService{

	@Autowired
	private IartistDao adaoref;
	
	@Override
	public List<Artist> getAllArtists() {
		// TODO Auto-generated method stub
		return adaoref.findAll();
	}

	@Override
	public Artist getArtistById(String email) {
		// TODO Auto-generated method stub
		return adaoref.getOne(email);
	}

	@Override
	public void addArtist(Artist artist) {
		// TODO Auto-generated method stub
		adaoref.save(artist);
	}

	@Override
	public void deleteArtist(String email) {
		// TODO Auto-generated method stub
		adaoref.deleteById(email);
		
	}

	@Override
	public void updateArtist(Artist artist, String email) {
		adaoref.save(artist);
	}
	
	 @Override public List<Artist> validate(String email, String pwd)
	  { 
		  
        List<Artist> artists=adaoref.login(email, pwd); 
        System.out.println(artists);
       
        if(artists.isEmpty()) {
       	 return artists; 
        }
        
        else
       	 return  artists;
      
       	 
        
       	 
        }

}
