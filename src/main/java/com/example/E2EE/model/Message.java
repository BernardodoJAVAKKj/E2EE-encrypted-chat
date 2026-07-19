package org.example.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Table (name = "Message")
@Entity
public class Message {

    @Autowired
   private Conversation conversation;


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID_message")
    private UUID id_message ;







}
