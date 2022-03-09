package com.alightmea.userms.controller;

import com.alightmea.userms.entities.User;
import com.alightmea.userms.repository.UserRepository;
import com.alightmea.userms.services.UserServiceImpl;
import com.alightmea.userms.services.UserServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserServiceInt userService;
    @Autowired
    UserRepository userrepo;


    @GetMapping("/hello")
    public String hello() {

        return userService.HelloWorld();
    }


    public UserController() {
    }

    @GetMapping(value = "/findUser/{userID}")
    @ResponseBody
    public User findUser(@PathVariable int userID) {
        User user1 = userrepo.findByUserId(userID);
        if (user1 != null)
            return user1;
        else return null;
    }

    @GetMapping(value = "getAllUsers")
    @ResponseBody
    public List<User> getAllUsers() {

        return userService.listAllUsers();
    }


    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user) {

        return userrepo.save(user);
    }

    @DeleteMapping(value = "/deleteuser/{iduser}")
    public String DeleteUser(@PathVariable int iduser) {
        userService.deleteUser(iduser);
        return "User deleted succussfully";
    }
}
