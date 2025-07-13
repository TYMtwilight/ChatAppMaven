package com.example.chat_app_maven.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * メッセージとユーザー名を組み合わせたDTOクラス
 * JOINクエリの結果を格納するために使用
 * チャット画面でのメッセージ表示用
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageWithUsername {

    /** メッセージID（主キー） */
    private Long id;

    /** ユーザーID（外部キー） */
    private Long userId;

    /** メッセージ内容 */
    private String message;

    /** ユーザー名（usersテーブルから取得） */
    private String username;

    /** レコード作成日時 */
    private LocalDateTime createdAt;

    /** レコード更新日時 */
    private LocalDateTime updatedAt;
}
