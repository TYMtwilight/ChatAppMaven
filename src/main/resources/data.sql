-- ユーザーデータの登録
INSERT INTO users (username, mail) VALUES ('admin', 'admin@example.com');
INSERT INTO users (username, mail) VALUES ('田中太郎', 'tanaka@example.com');
INSERT INTO users (username, mail) VALUES ('佐藤花子', 'sato@example.com');
INSERT INTO users (username, mail) VALUES ('鈴木一郎', 'suzuki@example.com');

-- メッセージデータの登録
INSERT INTO messages (user_id, message) VALUES (1, 'チャットルームへようこそ!');
INSERT INTO messages (user_id, message) VALUES (2, 'はじめまして、田中です。よろしくお願いします。');
INSERT INTO messages (user_id, message) VALUES (3, '佐藤です。今日はいい天気ですね!');
INSERT INTO messages (user_id, message) VALUES (4, '鈴木です。このチャットアプリ、使いやすそうですね。');
INSERT INTO messages (user_id, message) VALUES (2, '開発の進捗はどうですか?');
INSERT INTO messages (user_id, message) VALUES (3, 'Spring Boot + Reactの組み合わせは強力ですね!');
