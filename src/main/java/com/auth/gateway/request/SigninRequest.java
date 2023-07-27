package com.auth.gateway.request;

import lombok.*;


@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SigninRequest {
    private String email;
    private String password;
}
