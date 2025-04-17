package com.example.crud_Spring_Boot.dao;

import com.example.crud_Spring_Boot.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(User user);
    void deleteUser(long id);

}