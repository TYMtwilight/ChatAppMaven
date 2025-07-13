package com.example.chat_app_maven.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.chat_app_maven.mapper.UserMapper;
import com.example.chat_app_maven.model.User;
import com.example.chat_app_maven.service.UserService;

import lombok.RequiredArgsConstructor;

/**
 * ユーザー関連のビジネスロジックを実装するサービスクラス
 * UserServiceインターフェースの実装
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    /** UserMapperの依存性注入（Lombokで自動生成されるコンストラクタを使用） */
    private final UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public User findUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userMapper.deleteUserById(id);
    }
}
