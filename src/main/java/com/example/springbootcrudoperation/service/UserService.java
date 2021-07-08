package com.example.springbootcrudoperation.service;

import com.example.springbootcrudoperation.model.User;
import com.example.springbootcrudoperation.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

   private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {

        List<User> usersList = new ArrayList<>();
        userRepository.findAll().forEach(usersList::add);

        return usersList;
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
