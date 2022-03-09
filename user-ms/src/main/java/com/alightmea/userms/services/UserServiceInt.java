package com.alightmea.userms.services;

import com.alightmea.userms.entities.User;

import java.util.List;

public interface UserServiceInt {

    public String HelloWorld();

    List<User> listAllUsers();

    User getUserById(int id);

    User saveUser(User user);

    void deleteUser(int id);


}
