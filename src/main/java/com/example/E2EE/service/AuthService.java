package com.example.E2EE.service;


import com.example.E2EE.model.UserDetails;
import com.example.E2EE.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private UserDetails userDetails;


    public UserRepository Register() {

        if (userDetails.getUser_id() == null) {
            userDetails = new UserDetails();

        }


        return userRepository.save();
    }




}
