package com.app.main.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.app.main.dto.User;

import com.app.main.service.IuserService;
//Crossorigin("*")


@RestController
public class UserController {

@Autowired
IuserService userseriveRef;



	

@RequestMapping("/usertest")
public String welcomeuser() {

return "you are in the testing phase";

}


@RequestMapping("/userslist")
public List<User> getallUsers(){

return userseriveRef.getAllUsers();
}


@RequestMapping("/userslist/{uid}")
public User getUserById(@PathVariable int uid) {
return userseriveRef.getUserById(uid);
}


@RequestMapping(method = RequestMethod.POST,value = "/userslist")
public void addUser(@RequestBody User user)
{
userseriveRef.addUser(user);
}

@RequestMapping(method = RequestMethod.PUT,value = "/userslist/{uid}")
public void updateUser(@RequestBody User user,@PathVariable int uid)
{
userseriveRef.updateUser(user,uid);
}

@RequestMapping(method = RequestMethod.DELETE,value = "/userslist/{uid}")
public void deleteUser(@PathVariable int uid)
{
userseriveRef.deleteUser(uid);
}
	
	
	  @RequestMapping(value="/login/{email}/{pwd}",method = RequestMethod.POST)
	  public List<User> login(@PathVariable String email,@PathVariable String pwd )
	  { 
	    return  userseriveRef.validate(email,pwd);
	 
	     
	  }
	 
	 
	 
	 
	 
}

