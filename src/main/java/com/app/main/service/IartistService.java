package com.app.main.service;

import java.util.List;

import com.app.main.dto.Artist;



public interface IartistService {
	List<Artist> getAllArtists();
	Artist getArtistById(String email);
	void addArtist(Artist artist);
	void deleteArtist(String email);
	void updateArtist(Artist artist, String email);
	List<Artist> validate(String email,String pwd); 
}
