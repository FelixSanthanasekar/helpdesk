package com.helpdesk.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {
    @GetMapping("/login")
    @Operation(summary = "Login Details")
    public String login() {
        return "Hello Help Desk";
    }
}


