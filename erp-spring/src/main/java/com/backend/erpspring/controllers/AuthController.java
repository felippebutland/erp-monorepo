package com.backend.erpspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login"; // Retorna a página de login
    }

    @PostMapping("/logout")
    public String logout() {
        return "redirect:/login?logout"; // Redireciona para a página de login após o logout
    }
}
