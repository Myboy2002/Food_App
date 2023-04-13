package com.company.foodapp.model;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Dao;

import com.company.foodapp.model.User;

@Dao
public interface UserDao {
    @Insert
    void insert(User user);
    @Query("SELECT * FROM User where email= :mail and password= :password")
    User getUser(String mail, String password);

}