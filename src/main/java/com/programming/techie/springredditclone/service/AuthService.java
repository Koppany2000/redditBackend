package com.programming.techie.springredditclone.service;

import com.programming.techie.springredditclone.dto.AuthenticationResponse;
import com.programming.techie.springredditclone.dto.LoginRequest;
import com.programming.techie.springredditclone.dto.RefreshTokenRequest;
import com.programming.techie.springredditclone.dto.RegisterRequest;
import com.programming.techie.springredditclone.model.User;

public interface AuthService {

    void signup(RegisterRequest registerRequest);

    User getCurrentUser();
    boolean isLoggedIn();
    AuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
    AuthenticationResponse login(LoginRequest loginRequest);
    void verifyAccount(String token);

}
