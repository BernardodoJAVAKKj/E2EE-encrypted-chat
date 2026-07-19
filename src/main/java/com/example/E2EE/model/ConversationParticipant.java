package com.example.E2EE.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;


@Entity
@Table(name = "ConversationParticipant")
public class ConversationParticipant {

    @Autowired
    Conversation conversation;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;


    @Column(name = "FK")
    private UUID conversation_id;






}
