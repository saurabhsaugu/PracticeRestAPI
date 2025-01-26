package com.example.PracticeRestAPI.repository;

import com.example.PracticeRestAPI.model.UserDataDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDataDB, Integer> {

}
