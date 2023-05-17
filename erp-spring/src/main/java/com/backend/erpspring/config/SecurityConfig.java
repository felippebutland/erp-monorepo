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
                .requestMatchers("/login").permitAll() // Permitir o acesso ao login sem autenticação
                .requestMatchers("/address/**", "/categories/**", "/customers/**", "/products/**", "/sales/**", "/users/**").authenticated() // Autenticar todas as requisições para '/address'
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
