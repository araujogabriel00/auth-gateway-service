package com.auth.gateway.serviceImpl;

import com.auth.gateway.UserRepository;
import com.auth.gateway.model.User;
import com.auth.gateway.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;



    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("Nome de usuario não encontrado"));
            }
        };
    }

    @Override
    public boolean userExistsByUsername(String username) {
        return userRepository.findByEmail(username).isPresent();
    }
}
