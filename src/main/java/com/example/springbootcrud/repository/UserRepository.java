package com.example.springbootcrud.repository;

import com.example.springbootcrud.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
