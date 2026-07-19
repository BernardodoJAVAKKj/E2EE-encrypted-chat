package com.example.E2EE.model;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conversation_id", nullable = false)
    private Conversation conversation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id", nullable = false)
    private User sender;

    @Column(name = "encrypted_content", columnDefinition = "TEXT", nullable = false)
    private String encryptedContent;

    @Column(name = "encrypted_key", columnDefinition = "TEXT", nullable = false)
    private String encryptedKey;

    @Column(name = "iv", nullable = false, length = 100)
    private String iv;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private MessageStatus status;

    @Column(name = "sent_at", nullable = false)
    private Instant sentAt;

    protected Message() {
        // exigido pelo JPA
    }

    public Message(Conversation conversation, User sender, String encryptedContent,
                   String encryptedKey, String iv) {
        this.conversation = conversation;
        this.sender = sender;
        this.encryptedContent = encryptedContent;
        this.encryptedKey = encryptedKey;
        this.iv = iv;
        this.status = MessageStatus.SENT;
        this.sentAt = Instant.now();
    }

    public UUID getId() {
        return id;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public User getSender() {
        return sender;
    }

    public String getEncryptedContent() {
        return encryptedContent;
    }

    public String getEncryptedKey() {
        return encryptedKey;
    }

    public String getIv() {
        return iv;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public Instant getSentAt() {
        return sentAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message message)) return false;
        return id != null && id.equals(message.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}