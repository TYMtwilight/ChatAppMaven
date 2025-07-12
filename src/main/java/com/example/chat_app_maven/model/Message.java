package com.example.chat_app_maven.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * チャットメッセージ情報を管理するエンティティクラス
 * データベースのmessagesテーブルに対応
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

    /** メッセージID（主キー、自動採番） */
    private Long id;

    /** ユーザーID（外部キー、usersテーブルのidを参照、必須） */
    private Long userId;

    /** メッセージ内容（必須） */
    private String message;

    /** レコード作成日時 */
    private LocalDateTime createdAt;

    /** レコード更新日時 */
    private LocalDateTime updatedAt;
}
