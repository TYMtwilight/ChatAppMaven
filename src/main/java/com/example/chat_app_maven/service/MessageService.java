package com.example.chat_app_maven.service;

import java.util.List;

import com.example.chat_app_maven.model.Message;
import com.example.chat_app_maven.model.MessageWithUsername;

/**
 * メッセージ関連のビジネスロジックを定義するサービスインターフェース
 * コントローラーとMapperの間の仲介役として機能
 * SELECT操作では常にユーザー名も含めて取得
 */
public interface MessageService {

    /**
     * 全メッセージをユーザー名と一緒に取得
     * 
     * @return メッセージ+ユーザー名のリスト（作成日時の昇順）
     */
    List<MessageWithUsername> findAllMessages();

    /**
     * 指定されたIDのメッセージをユーザー名と一緒に取得
     * 
     * @param id メッセージID
     * @return 該当メッセージ+ユーザー名（存在しない場合はnull）
     */
    MessageWithUsername findMessageWithUsernameById(Long id);

    /**
     * 指定されたユーザーIDのメッセージをユーザー名と一緒に取得
     * 
     * @param userId ユーザーID
     * @return 該当ユーザーのメッセージ+ユーザー名のリスト（作成日時の昇順）
     */
    List<MessageWithUsername> findMessagesWithUsernameByUsername(String username);

    /**
     * 新しいメッセージを登録
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
