package com.alightmea.userms.controller;

import com.alightmea.userms.config.UserServiceConfig;
import com.alightmea.userms.entities.Properties;
import com.alightmea.userms.entities.User;
import com.alightmea.userms.repository.UserRepository;
import com.alightmea.userms.services.UserServiceImpl;
import com.alightmea.userms.services.UserServiceInt;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")

public class UserController {

    @Autowired
    UserServiceInt userService;
    @Autowired
    UserRepository userrepo;
    @Autowired
    UserServiceConfig userconfig;


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
        return "User deleted successfully";
    }

  @GetMapping("/user/properties")
    public String getPropertyDetails() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        Properties properties = new Properties(userconfig.getMsg(), userconfig.getBuildVersion(),
                userconfig.getMailDetails());
        String jsonStr = ow.writeValueAsString(properties);
        return jsonStr;
    }
}
