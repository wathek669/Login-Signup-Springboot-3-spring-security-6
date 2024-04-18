package com.example.spring.security.module.service;

import com.example.spring.security.module.dto.JwtAuthenticationResponse;
import com.example.spring.security.module.dto.RefreshTokenRequest;
import com.example.spring.security.module.dto.SigninRequest;
import com.example.spring.security.module.dto.SignupRequest;
import com.example.spring.security.module.entity.User;

public interface AuthenticationService {
     User signup(SignupRequest signupRequest);
     JwtAuthenticationResponse signin(SigninRequest signinRequest);
     JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
