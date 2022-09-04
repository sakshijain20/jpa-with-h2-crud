package com.jparepository.jpa.controllers;

import com.jparepository.jpa.models.User;
import com.jparepository.jpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.findUserById(id);
    }

    @DeleteMapping("delete/{id}")
    public String deleteUserById(@PathVariable("id") int id){
        return userService.deleteUser(id);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
}
