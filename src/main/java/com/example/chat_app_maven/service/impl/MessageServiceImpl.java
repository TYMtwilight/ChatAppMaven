package com.example.chat_app_maven.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.chat_app_maven.mapper.MessageMapper;
import com.example.chat_app_maven.model.Message;
import com.example.chat_app_maven.model.MessageWithUsername;
import com.example.chat_app_maven.service.MessageService;

import lombok.RequiredArgsConstructor;

/**
 * メッセージ関連のビジネスロジックを実装するサービスクラス
 * MessageServiceインターフェースの実装
 */
@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    /** MessageMapperの依存性注入（Lombokで自動生成されるコンストラクタを使用） */
    private final MessageMapper messageMapper;

    @Override
    public List<MessageWithUsername> findAllMessages() {
        return messageMapper.getAllMessagesWithUsername();
    }

    @Override
    public MessageWithUsername findMessageWithUsernameById(Long id) {
        return messageMapper.getMessageWithUsernameById(id);
    }

    @Override
    public List<MessageWithUsername> findMessagesWithUsernameByUsername(String username) {
        return messageMapper.getMessagesWithUsernameByUsername(username);
    }

    @Override
    public void insertMessage(Message message) {
        messageMapper.insertMessage(message);
    }

    @Override
    public void updateMessage(Message message) {
        messageMapper.updateMessage(message);
    }

    @Override
    public void deleteMessageById(Long id) {
        messageMapper.deleteMessageById(id);
    }
}