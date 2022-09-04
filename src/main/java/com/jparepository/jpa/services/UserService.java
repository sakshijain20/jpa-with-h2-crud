package com.jparepository.jpa.services;

import com.jparepository.jpa.models.User;
import com.jparepository.jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;


    public User addUser(User user){
        User newUser = userRepo.save(user);
        return newUser;
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User findUserById(int id){
        return userRepo.findById(id).get();
    }

   public String deleteUser(int id){
        userRepo.deleteById(id);
        return "User deleted successfully";
   }

   public User updateUser(User user){
        return userRepo.saveAndFlush(user);
   }
}
