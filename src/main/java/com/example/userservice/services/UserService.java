package com.example.userservice.services;

import com.example.userservice.entities.User;

import java.util.List;

public interface UserService {
    //user operations
    //create
   User saveUser (User user);
   //GetAllUser
   List<User> getAllUser();
   //get single user by id
   User getUser(String userId);


}
