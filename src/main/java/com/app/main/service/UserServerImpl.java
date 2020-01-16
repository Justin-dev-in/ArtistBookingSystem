package com.app.main.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.main.dao.IuserDao;

import com.app.main.dto.User;

@Service
public class UserServerImpl implements IuserService{


@Autowired
private IuserDao udaoref;


@Override
public List<User> getAllUsers() {
// TODO Auto-generated method stub
//return userlist;
return udaoref.findAll();
}

@Override
public User getUserById(int uid) {

//return userlist.stream().filter(u ->u.getUid()==uid).findFirst().get();
return udaoref.getOne(uid);
}

@Override
public void addUser(User user) {
// TODO Auto-generated method stub
//userlist.add(user);

udaoref.save(user);

}


@Override
public void deleteUser(int uid) {
// TODO Auto-generated method stub
//userlist.removeIf(u->u.getUid()==uid);

udaoref.deleteById(uid);
}


@Override
public void updateUser(User user, int uid) {
// TODO Auto-generated method stub

udaoref.save(user);

}

	
	  @Override public List<User> validate(String email, String pwd)
	  { 
		  
         List<User> users=udaoref.login(email, pwd); 
         
        
         if(users.isEmpty()) {
        	 return users; 
         }
         
         else
        	 return  users;
       
        	 
         
        	 
         }
	





}
