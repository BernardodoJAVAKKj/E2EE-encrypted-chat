package com.example.E2EE.model;

import jakarta.persistence.*;
import org.hibernate.query.sqm.tuple.internal.AnonymousTupleBasicEntityIdentifierMapping;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "Conversation")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column (name = "Conversetation_id")
    private  UUID conversation_id;


    @Column(name = "CreatedAt")
    private Instant createdAt;

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
    public Instant getCreatedAt() {
        return createdAt;
    }

    public UUID getConversation_id() {
      return conversation_id;
    }
    public void setConversation_id(UUID conversation_id) {
        this.conversation_id = conversation_id;
    }
}
