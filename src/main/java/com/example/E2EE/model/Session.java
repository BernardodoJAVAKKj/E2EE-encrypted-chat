package com.example.E2EE.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Instant;
import java.util.UUID;

@Table(name = "Session")
@Entity
public class Session {

    @Autowired
    UserDetails userDetails;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @PrimaryKeyJoinColumn
    private UUID id;

    @Column(name = "User_ID")
    private UUID user_id;

    @Column (name = "Device_ID")
    private String deviceID;

    @Column(name = "ConectedAt")
    private Instant conectedAt;



    public void setConectedAt(Instant conectedAt) {
        this.conectedAt = conectedAt;
    }
    public Instant getConectedAt() {
        return conectedAt;
    }
    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }
    public UUID getUser_id() {
        return user_id;
    }
    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }
    public String getDeviceID() {
        return deviceID;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public UUID getId() {
        return id;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }
    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
