package com.example.springbootcrud.service;

import com.example.springbootcrud.model.User;
import com.example.springbootcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public List<User> listAll() {
        return (List<User>) userRepository.findAll();
    }

    public void save(User user) {

        userRepository.save(user);
    }

    public void delete(Long id) {

        userRepository.deleteById(id);
    }

    public User get(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);

        return optionalUser.get();

    }
}
