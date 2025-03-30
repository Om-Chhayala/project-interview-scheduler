package com.interviewer_scheduler.interviewer_scheduler.Controller;

import com.interviewer_scheduler.interviewer_scheduler.Model.User;
import com.interviewer_scheduler.interviewer_scheduler.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Signup (Register a new user)
    @PostMapping("/signup")
    public String registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // Login (Accepting email & password in body)
    @PostMapping("/login")
    public String loginUser(@RequestBody User loginRequest) {
        return userService.loginUser(loginRequest.getEmail(), loginRequest.getPassword());
    }

    @GetMapping("/getinterviewer")
    public List<User> getInterviewers() {
        return userService.getInterviewers();
    }
}