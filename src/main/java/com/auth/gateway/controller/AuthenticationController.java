package com.auth.gateway.controller;


import com.auth.gateway.request.SigninRequest;
import com.auth.gateway.request.SignupRequest;
import com.auth.gateway.response.JwtAuthenticationResponse;
import com.auth.gateway.service.AutheticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AutheticationService autheticationService;

    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SignupRequest signupRequest
    ) {
        return ResponseEntity.ok(autheticationService.signup(signupRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SigninRequest signinRequest) {
        return ResponseEntity.ok(autheticationService.signin(signinRequest));
    }
}
