package com.example.springbootcrudoperation.repository;

import com.example.springbootcrudoperation.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
