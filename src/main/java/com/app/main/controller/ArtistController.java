package com.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.dto.Artist;
import com.app.main.service.IartistService;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
@CrossOrigin("*")
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


@RequestMapping("/artistslist/{email}")
public Artist getArtistById(@PathVariable String email) {
return  artistserviceRef.getArtistById(email);
}


@RequestMapping(method = RequestMethod.POST,value = "/artistslist")
public void addArtist(@RequestBody Artist artist)
{
	 artistserviceRef.addArtist(artist);
}

@RequestMapping(method = RequestMethod.PUT,value = "/artistslist/{email}")
public void updateArtist(@RequestBody Artist artist,@PathVariable String email)
{
	artistserviceRef.updateArtist(artist,email);
}

@RequestMapping(method = RequestMethod.DELETE,value = "/artistslist/{email}")
public void deleteArtist(@PathVariable String email)
{
	 artistserviceRef.deleteArtist(email);
}




@RequestMapping(value="/Alogin",method = RequestMethod.POST)
public String login(@RequestBody JSONObject artist)
{ 
	JSONObject json=(JSONObject)JSONSerializer.toJSON(artist);
	String artistEmailID=json.getString("artistEmail");
	String artistPassword=json.getString("artistPassword");
  return  artistserviceRef.validate(artistEmailID,artistPassword);

   
}

}
