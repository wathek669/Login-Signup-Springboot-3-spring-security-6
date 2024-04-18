package com.example.spring.security.module.dto;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
    private String token ;
    private String refreshToken;
}
