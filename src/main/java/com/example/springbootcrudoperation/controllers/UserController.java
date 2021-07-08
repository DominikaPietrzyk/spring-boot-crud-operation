package com.example.springbootcrudoperation.controllers;

import com.example.springbootcrudoperation.dto.UserDto;
import com.example.springbootcrudoperation.map.UserMapper;
import com.example.springbootcrudoperation.model.User;
import com.example.springbootcrudoperation.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

   private final UserService userService;
   private final UserMapper userMapper;


    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping()
    public List<User>getAll(){
        return userService.getAll();
    }

    @GetMapping("/user")
    public User getUserById(Long userId){
      return userService.findById(userId);
    }

    @DeleteMapping("/user/{userId}")
    public void deleteUserById(@PathVariable("userId") Long userId){
         userService.deleteById(userId);
    }

    @PostMapping("/new/user")
    public void saveUser(User user){
          userService.save(user);
    }

    @PostMapping("/update")
   public UserDto update(@RequestBody UserDto userDto)
   {
       User user = userMapper.toEntity(userDto);
       userService.save(user);
       return userMapper.toDto(user);
   }




}
