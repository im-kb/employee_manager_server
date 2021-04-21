package com.example.user_manager.service;

import com.example.user_manager.exception.UserNotFoundException;
import com.example.user_manager.model.User;
import com.example.user_manager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private final UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        user.setUserCode(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }

    public User findUserById(Long id){
        return userRepo.findUserById(id).orElseThrow(()-> new UserNotFoundException("User with id: "+id+"not found"));
    }

    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }
}
