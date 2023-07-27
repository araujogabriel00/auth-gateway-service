package com.auth.gateway.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/teste")
@RequiredArgsConstructor
public class TesteController {

    private final AuthenticationManager authenticationManager;
    @GetMapping
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("DEU BOM");
    }
}
