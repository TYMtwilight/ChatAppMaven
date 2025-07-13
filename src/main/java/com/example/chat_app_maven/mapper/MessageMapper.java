package com.example.chat_app_maven.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.chat_app_maven.model.Message;
import com.example.chat_app_maven.model.MessageWithUsername;

/**
 * メッセージ操作用のMyBatisマッパーインターフェース
 * データベースのmessagesテーブルに対するCRUD操作を定義
 * SELECT操作はすべてusersテーブルとJOINしてユーザー名も取得
 */
@Mapper
public interface MessageMapper {

    /**
     * 全メッセージをユーザー名と一緒に時系列順で取得
     * 
     * @return メッセージ+ユーザー名のリスト（作成日時の昇順）
     */
    List<MessageWithUsername> getAllMessagesWithUsername();

    MessageWithUsername getMessageWithUsernameById(Long id);

    /**
     * 指定されたユーザーのメッセージをユーザー名と一緒に全て取得
     * 
     * @param username ユーザー名
     * @return 該当ユーザーのメッセージ+ユーザー名のリスト（作成日時の昇順）
     */
    List<MessageWithUsername> getMessagesWithUsernameByUsername(String username);

    /**
     * 新しいメッセージを挿入
     * 
     * @param message 登録するメッセージ情報
     */
    void insertMessage(Message message);

    /**
     * 既存メッセージの情報を更新
     * 
     * @param message 更新するメッセージ情報
     */
    void updateMessage(Message message);

    /**
     * 指定されたIDのメッセージを削除
     * 
     * @param id 削除対象のメッセージID
     */
    void deleteMessageById(Long id);
}
