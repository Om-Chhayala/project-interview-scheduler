package com.interviewer_scheduler.interviewer_scheduler.Service;


import com.interviewer_scheduler.interviewer_scheduler.Model.User;
import com.interviewer_scheduler.interviewer_scheduler.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register a new user
    public String registerUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already registered!";
        }
        userRepository.save(user);
        return "User registered successfully!";
    }

    // Login user
    public String loginUser(String email, String password) {
        Optional<User> existingUser = userRepository.findByEmail(email);
        if (existingUser.isPresent() && existingUser.get().getPassword().equals(password)) {
            return "Login successful!";
        }
        return "Invalid credentials!";
    }
}

