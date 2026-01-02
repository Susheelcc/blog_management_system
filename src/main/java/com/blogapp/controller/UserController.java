package com.blogapp.controller;

import com.blogapp.dto.UserRequest;
import com.blogapp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public String signUp(@RequestBody UserRequest userRequest) {
        userService.createUser(userRequest);
        return "User registered successfully";
    }

}
