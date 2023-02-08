package com.example.sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String createUser(User user){

//        int id = user.getId();
//        if(id == userRepository.find)
        userRepository.save(user);
        return "added successfully";
    }

    public User getUser(int id){
        return userRepository.findById(id).get(); // find the entity by primary key
    }

    public List<User> getAllUser(){
       // List<User> user = userRepository.findAll();
        return userRepository.findAll();
    }
}
