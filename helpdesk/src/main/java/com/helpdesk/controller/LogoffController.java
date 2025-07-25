package com.helpdesk.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.headers.Header;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LogoffController {
    @GetMapping("/logoff")
    @Operation(summary = "Logoff Details")
    public String login(@Parameter String name,
                        @RequestHeader("Authorization") String authHeader) {
        return "System Logoff "+ name;
    }
}


