package com.example.daopathern.impli;

import com.example.daopathern.dao.UserDao;
import com.example.daopathern.model.User;

import java.util.List;

public class UserImplDao implements UserDao {

    private UserDao userDao;
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
    userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
    userDao.deleteUser(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
