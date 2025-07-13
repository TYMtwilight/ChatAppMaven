package com.example.chat_app_maven.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.chat_app_maven.model.User;

/**
 * ユーザー操作用のMyBatisマッパーインターフェース
 * データベースのusersテーブルに対するCRUD操作を定義
 */
@Mapper
public interface UserMapper {

    /**
     * 全ユーザーを取得
     * 
     * @return ユーザーリスト
     */
    List<User> getAllUsers();

    /**
     * 指定されたIDのユーザーを取得
     * 
     * @param id ユーザーID
     * @return 該当ユーザー（存在しない場合はnull）
     */
    User getUserById(Long id);

    /**
     * 新しいユーザーを挿入
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
