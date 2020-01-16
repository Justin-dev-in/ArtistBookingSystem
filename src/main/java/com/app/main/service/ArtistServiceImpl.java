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
	public Artist getArtistById(int aid) {
		// TODO Auto-generated method stub
		return adaoref.getOne(aid);
	}

	@Override
	public void addArtist(Artist artist) {
		// TODO Auto-generated method stub
		adaoref.save(artist);
	}

	@Override
	public void deleteArtist(int aid) {
		// TODO Auto-generated method stub
		adaoref.deleteById(aid);
		
	}

	@Override
	public void updateArtist(Artist artist, int aid) {
		// TODO Auto-generated method stub
		adaoref.save(artist);
	}
	
	 @Override public List<Artist> validate(String email, String pwd)
	  { 
		  
        List<Artist> artists=adaoref.login(email, pwd); 
        
       
        if(artists.isEmpty()) {
       	 return artists; 
        }
        
        else
       	 return  artists;
      
       	 
        
       	 
        }

}
