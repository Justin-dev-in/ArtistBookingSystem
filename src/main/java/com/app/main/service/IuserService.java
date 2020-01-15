package com.app.main.service;

import java.util.List;

import com.app.main.dto.User;

public interface IuserService {

List<User> getAllUsers();
User getUserById(int uid);
void addUser(User user);
void deleteUser(int uid);
void updateUser(User user, int uid);
}

