package com.taemin.chat.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Document(collation = "chat")
public class Chat {
    @Id
    private String id;
    private String message;
    private String sender;
    private String receiver;
    @CreatedDate
    private LocalDateTime createdAt;
}
