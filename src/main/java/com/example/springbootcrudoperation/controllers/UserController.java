package com.example.springbootcrudoperation.controllers;

import com.example.springbootcrudoperation.model.User;
import com.example.springbootcrudoperation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User>getAll(){
        return userService.getAll();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.add(user);
    }

    @GetMapping("/user")
    public User getUserById(@PathVariable("userId") Long userId){
      return userService.findById(userId);
    }

    @DeleteMapping("user/{userId}")
    public void deleteUserById(@PathVariable("userId") Long userId){
         userService.deleteById(userId);
    }

    @PostMapping("/new/user")
    public void saveUser(User user){
          userService.save(user);
    }

}
