package com.auth.gateway.request;

import lombok.*;

@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SignupRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
