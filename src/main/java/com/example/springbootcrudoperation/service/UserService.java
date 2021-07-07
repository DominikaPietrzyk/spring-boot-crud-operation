package com.example.springbootcrudoperation.service;

import com.example.springbootcrudoperation.model.User;
import com.example.springbootcrudoperation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll() {

        List<User> usersList = new ArrayList<>();
        userRepository.findAll().forEach(usersList::add);
        return usersList;
    }

    public User add(User user) {

        user= userRepository.save(user);

        return user;
    }

    public User findById(Long id){
        return userRepository.findById(id).get();
    }

    public void deleteById(Long id){
          userRepository.deleteById(id);
    }

    public void save(User user){
        userRepository.save(user);
    }
}
