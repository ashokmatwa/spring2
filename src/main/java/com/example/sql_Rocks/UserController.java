package com.example.sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public String createUser(@RequestBody User user){
      return userService.createUser(user);
      //use try catch
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
//        List<User> user = userService.getAllUser();
        return userService.getAllUser();
    }
}
