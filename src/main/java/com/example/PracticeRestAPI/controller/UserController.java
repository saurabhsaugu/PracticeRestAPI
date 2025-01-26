package com.example.PracticeRestAPI.controller;

import com.example.PracticeRestAPI.dto.UserData;
import com.example.PracticeRestAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserData> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getUsers/{id}")
    public UserData getUsersByID(@PathVariable int id){
        return userService.getUsersByID(id);
    }

    @PostMapping("/register")
    public String register(@RequestBody UserData user){
        return userService.register(user);
    }

    @PutMapping("/updateUsers")
    public UserData updateUsers(@RequestBody UserData user){
        return userService.updateUsers(user);
    }

    @DeleteMapping("/deleteUsers/{id}")
    public String deleteUsers(@PathVariable int id){
        return userService.deleteUsers(id);
    }
}