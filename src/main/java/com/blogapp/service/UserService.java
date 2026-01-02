package com.blogapp.service;

import com.blogapp.dto.UserRequest;
import com.blogapp.entity.User;
import com.blogapp.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor injection - Spring supplies the repository automatically
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create a new user from DTO input
    public void createUser(UserRequest req) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        User user = new User(
                req.getUsername(),
                req.getEmail(),
                encoder.encode(req.getPassword())
        );

        userRepository.save(user);
    }
}
