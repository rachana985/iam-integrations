package com.iam.integrations.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Bean;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authz -> authz
                        .anyRequest().authenticated()
                ).oauth2Login(oauth2 -> oauth2
                                .loginPage("/login") // Custom login page endpoint
                                .defaultSuccessUrl("/home", true) // Redirect after successful login
                        // .authorizationEndpoint(authorization -> ...)
                        // .redirectionEndpoint(redirection -> ...)
                        // .tokenEndpoint(token -> ...)
                        // .userInfoEndpoint(userInfo -> ...)
                );

        return http.build();
    }
}
