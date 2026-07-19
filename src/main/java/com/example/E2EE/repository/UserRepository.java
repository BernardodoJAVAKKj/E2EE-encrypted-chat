package com.example.E2EE.repository;

import com.example.E2EE.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserDetails, UUID> {
    boolean existsByEmail(String email);

    boolean existsById(String email);
}