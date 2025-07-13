package com.example.chat_app_maven.service;

import java.util.List;

import com.example.chat_app_maven.model.User;

/**
 * ユーザー関連のビジネスロジックを定義するサービスインターフェース
 * コントローラーとMapperの間の仲介役として機能
 */
public interface UserService {

    /**
     * 全ユーザーを取得
     * 
     * @return ユーザーリスト
     */
    List<User> findAllUsers();

    /**
     * 指定されたIDのユーザーを取得
     * 
     * @param id ユーザーID
     * @return 該当ユーザー（存在しない場合はnull）
     */
    User findUserById(Long id);

    /**
     * 新しいユーザーを登録
     * 
     * @param user 登録するユーザー情報
     */
    void insertUser(User user);

    /**
     * 既存ユーザーの情報を更新
     * 
     * @param user 更新するユーザー情報
     */
    void updateUser(User user);

    /**
     * 指定されたIDのユーザーを削除
     * 
     * @param id 削除対象のユーザーID
     */
    void deleteUserById(Long id);
}
