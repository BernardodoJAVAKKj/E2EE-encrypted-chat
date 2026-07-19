package com.example.E2EE.model;


import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Table(name = "User")
@Entity
public class UserDetails {


    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID user_id;

    @Column(nullable = false, unique = true, length = 100, name = "Name")
    private String name;

    @Column(nullable = false, unique = true, length = 100, name = "Email")
    private String email;

    private String password;

    private String publicKey;

    @Column(nullable = false, unique = true, length = 100, name = "CreatedAt")
    private Instant createdAt;

    public UserDetails(String name, String email, String encodedPassword, String publicKey) {
    }


    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_idd(UUID user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
