package com.company.foodapp.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.company.foodapp.model.User;

@Database(entities = {User.class},version = 2)
public abstract class UserDatabaseClass extends RoomDatabase {
    public abstract UserDao getUserDao();
}
