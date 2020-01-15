package com.app.main.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.main.dao.IuserDao;
import com.app.main.dto.User;

;


@Service
public class UserServerImpl implements IuserService{

/*List<User> userlist=new ArrayList<>(Arrays.asList(

new User(1,"Shoaib","Bepari@123","12 lane laxmi road","Jaysingpur",416101,"9011065321","sbepari@gmail.com"),
new User(2,"Shoaib","Bepari@123","12 lane laxmi road","Jaysingpur",416101,"9011065321","sbepari@gmail.com"),
new User(2,"Shoaib","Bepari@123","12 lane laxmi road","Jaysingpur",416101,"9011065321","sbepari@gmail.com")

));*/


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
/*for (int i = 0; i < userlist.size(); i++) {
User u=userlist.get(i);
if(u.getUid()==uid)
{
userlist.set(i, user);
return;
}
}*/
udaoref.save(user);

}





}
