package com.auth.gateway.service;

import com.auth.gateway.request.SigninRequest;
import com.auth.gateway.request.SignupRequest;
import com.auth.gateway.response.JwtAuthenticationResponse;

public interface AutheticationService {
    JwtAuthenticationResponse signup(SignupRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
