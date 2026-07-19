package com.example.E2EE.repository;

import com.example.E2EE.model.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository<Conversation, Integer> {
}
