package com.example.PracticeRestAPI.service;

import com.example.PracticeRestAPI.dto.UserData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<UserData> users = new ArrayList<>(List.of(
            new UserData(1, "sg", "abc@123", "S G", 36),
            new UserData(2, "dg", "abc@123", "D G", 34)
    ));

    public List<UserData> getUsers() {
        return users;
    }

    public UserData getUsersByID(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public String register(UserData user) {
        users.add(user);
        return "User is Registered successfully!!!";
    }

    public UserData updateUsers(UserData user) {
        UserData userData = users.stream()
                .filter(u -> u.getId() == user.getId())
                .findFirst()
                .orElse(null);
        if (userData != null) {
            userData.setName(user.getName());
            userData.setAge(user.getAge());
            return userData;
        }
        return null;
    }

    public String deleteUsers(int id) {
        users.remove(users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null));
        return "User is deleted successfully!!!";
    }
}
