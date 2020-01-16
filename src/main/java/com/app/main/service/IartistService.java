package com.app.main.service;

import java.util.List;

import com.app.main.dto.Artist;



public interface IartistService {
	List<Artist> getAllArtists();
	Artist getArtistById(int aid);
	void addArtist(Artist artist);
	void deleteArtist(int aid);
	void updateArtist(Artist artist, int aid);
	List<Artist> validate(String email,String pwd); 
}
