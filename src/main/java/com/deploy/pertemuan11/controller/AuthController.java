package com.deploy.pertemuan11.controller;

import com.deploy.pertemuan11.model.dto.RegisterRequest;
import com.deploy.pertemuan11.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @GetMapping("/register")
    public String registerPage(Model model) {

        model.addAttribute("request", new RegisterRequest());

        return "register";
    }
}
