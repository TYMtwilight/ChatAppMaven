package com.example.chat_app_maven.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * ユーザー情報を管理するエンティティクラス
 * データベースのusersテーブルに対応
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /** ユーザーID（主キー、自動採番） */
    private Long id;

    /** ユーザー名（一意制約あり、必須） */
    private String username;

    /** メールアドレス（一意制約あり、任意） */
    private String mail;

    /** レコード作成日時 */
    private LocalDateTime createdAt;

    /** レコード更新日時 */
    private LocalDateTime updatedAt;
}
