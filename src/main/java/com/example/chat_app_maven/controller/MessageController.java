package com.example.chat_app_maven.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chat_app_maven.model.Message;
import com.example.chat_app_maven.model.MessageWithUsername;
import com.example.chat_app_maven.service.MessageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    // 全メッセージ取得
    @GetMapping
    public ResponseEntity<List<MessageWithUsername>> getAllMessages() {
        List<MessageWithUsername> messages = messageService.findAllMessages();
        return ResponseEntity.ok(messages);
    }

    // ID指定でメッセージ取得
    @GetMapping("/{id}")
    public ResponseEntity<MessageWithUsername> getMessageById(@PathVariable Long id) {
        MessageWithUsername message = messageService.findMessageWithUsernameById(id);
        if (message != null) {
            return ResponseEntity.ok(message);
        }
        return ResponseEntity.notFound().build();
    }

    // ユーザー名指定でメッセージ取得
    @GetMapping("/user/{username}")
    public ResponseEntity<List<MessageWithUsername>> getMessageByUsername(@PathVariable String username) {
        List<MessageWithUsername> messages = messageService.findMessagesWithUsernameByUsername(username);
        return ResponseEntity.ok(messages);
    }

    // メッセージ作成
    @PostMapping("/save")
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        messageService.insertMessage(message);
        return ResponseEntity.ok(message);
    }

    // メッセージ更新
    @PutMapping("/{id}")
    public ResponseEntity<Message> updateMessage(@PathVariable Long id, @RequestBody Message message) {
        message.setId(id);
        messageService.updateMessage(message);
        return ResponseEntity.ok(message);
    }

    // メッセージ削除
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMessage(@PathVariable Long id) {
        messageService.deleteMessageById(id);
        return ResponseEntity.noContent().build();
    }
}