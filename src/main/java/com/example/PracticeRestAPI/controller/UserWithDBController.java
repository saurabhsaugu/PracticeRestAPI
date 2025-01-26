package com.example.PracticeRestAPI.controller;

import com.example.PracticeRestAPI.model.UserDataDB;
import com.example.PracticeRestAPI.service.UserServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserWithDBController {
    @Autowired
    private UserServiceDB userServiceDB;

    @GetMapping("/getUsersDB")
    public List<UserDataDB> getUsersDB() {
        return userServiceDB.getUsersDB();
    }

    @GetMapping("/getUsersDB/{id}")
    public UserDataDB getUsersDBByID(@PathVariable int id) {
        return userServiceDB.getUsersDBByID(id);
    }

    @PostMapping("/registerDB")
    public String registerDB(@RequestBody UserDataDB user) {
        return userServiceDB.registerDB(user);
    }

    @PutMapping("/updateUsersDB")
    public UserDataDB updateUsersDB(@RequestBody UserDataDB user) {
        return userServiceDB.updateUsersDB(user);
    }

    @DeleteMapping("/deleteUsersDB/{id}")
    public String deleteUsersDB(@PathVariable int id) {
        return userServiceDB.deleteUsersDB(id);
    }
}