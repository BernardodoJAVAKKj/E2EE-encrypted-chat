package com.example.E2EE.service;


import com.example.E2EE.model.UserDetails;
import com.example.E2EE.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Transactional
    public UserDetails register(UserDetails userDetails) {

        if (userRepository.existsByEmail(userDetails.getEmail())) {
            throw new UsernameNotFoundException("Id Already Exists");
        }

        String encodedPassword = passwordEncoder.encode(userDetails.getPassword());
        userDetails.setPassword(encodedPassword);

        UserDetails user = new UserDetails(
                userDetails.getName(),
                userDetails.getEmail(),
                encodedPassword,
                userDetails.getPublicKey()
        );


        return userRepository.save(user);

    }



    public UserDetails Login(UserDetails userDetails) {
        if (userRepository.existsByEmail(userDetails.getEmail())) {}





        return null;

    }

}
