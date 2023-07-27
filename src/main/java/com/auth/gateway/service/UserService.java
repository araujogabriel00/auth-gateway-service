package com.auth.gateway.service;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();

    boolean userExistsByUsername(String username);
}
