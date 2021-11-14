package com.example.daopathern.dao;

import com.example.daopathern.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    List<User> getUsers();

}
