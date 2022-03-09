package com.alightmea.userms.services;

import com.alightmea.userms.entities.User;
import com.alightmea.userms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInt {

    @Autowired
    UserRepository userrepo;


    @Override
    public String HelloWorld() {

        return "hello from user service";
    }

    @Override
    public List<User> listAllUsers() {

        return userrepo.findAll();

    }

    @Override
    public User getUserById(int id) {

        return userrepo.findByUserId(id);
    }

    @Override
    public User saveUser(User user) {

        return userrepo.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userrepo.deleteById(id);


    }
}
