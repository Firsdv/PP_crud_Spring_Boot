package com.example.crud_Spring_Boot.service;

import com.example.crud_Spring_Boot.dao.UserDao;
import com.example.crud_Spring_Boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }


    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }


    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}