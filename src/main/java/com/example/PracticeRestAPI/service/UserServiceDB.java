package com.example.PracticeRestAPI.service;

import com.example.PracticeRestAPI.model.UserDataDB;
import com.example.PracticeRestAPI.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceDB {

    @Autowired
    private UserRepo userRepo;

    public List<UserDataDB> getUsersDB() {
        return userRepo.findAll();
    }

    public UserDataDB getUsersDBByID(int id) {
        return userRepo.findById(id).orElse(null);
    }

    public String registerDB(UserDataDB user) {
        userRepo.save(user);
        return "User is Registered successfully!!!";
    }

    public UserDataDB updateUsersDB(UserDataDB user) {
        return userRepo.save(user);
    }

    public String deleteUsersDB(int id) {
        userRepo.deleteById(id);
        return "User is deleted successfully!!!";
    }
}
