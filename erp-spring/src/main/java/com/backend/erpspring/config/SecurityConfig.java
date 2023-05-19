package com.backend.erpspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .requestMatchers("/login").permitAll()
                // .requestMatchers("/address/**").hasRole("ADMIN")
                // .requestMatchers("/categories/**").hasRole("ADMIN")
                // .requestMatchers("/customers/**").hasRole("ADMIN")
                // .requestMatchers("/sales/**").hasRole("ADMIN")
                // .requestMatchers("/users/**").hasRole("ADMIN")
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .logoutUrl("/logout")
                .permitAll();
        return http.build();
    }
}
