package com.example.chat_app_maven.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authz -> authz
                .requestMatchers("/h2-console/**").permitAll() // H2コンソールを許可
                .requestMatchers("/ws/**").permitAll() // WebSocketを許可
                .requestMatchers("/api/**").permitAll() // API エンドポイントを許可
                .anyRequest().authenticated() // その他は認証必要
        )
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/h2-console/**") // H2コンソールでCSRF無効
                        .ignoringRequestMatchers("/ws/**") // WebSocketでCSRF無効
                        .ignoringRequestMatchers("/api/**") // API でCSRF無効
                )
                .headers(headers -> headers
                        .frameOptions(frameOptions -> frameOptions.sameOrigin()) // H2コンソールでiframe許可
                );

        return http.build();
    }
}
