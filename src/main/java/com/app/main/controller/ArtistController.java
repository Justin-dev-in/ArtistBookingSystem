package com.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.dto.Artist;
import com.app.main.service.IartistService;

@RestController
public class ArtistController {


@Autowired
IartistService artistserviceRef;

@RequestMapping("/artiststest")
public String welcomeartist() {

return "you are in the testing phase";

}


@RequestMapping("/artistslist")
public List<Artist> getallArtists(){

return  artistserviceRef.getAllArtists();
}


@RequestMapping("/artistslist/{aid}")
public Artist getArtistById(@PathVariable int aid) {
return  artistserviceRef.getArtistById(aid);
}


@RequestMapping(method = RequestMethod.POST,value = "/artistslist")
public void addArtist(@RequestBody Artist artist)
{
	 artistserviceRef.addArtist(artist);
}

@RequestMapping(method = RequestMethod.PUT,value = "/artistslist/{aid}")
public void updateArtist(@RequestBody Artist artist,@PathVariable int aid)
{
	 artistserviceRef.updateArtist(artist,aid);
}

@RequestMapping(method = RequestMethod.DELETE,value = "/artistslist/{aid}")
public void deleteUser(@PathVariable int aid)
{
	 artistserviceRef.deleteArtist(aid);
}




}
