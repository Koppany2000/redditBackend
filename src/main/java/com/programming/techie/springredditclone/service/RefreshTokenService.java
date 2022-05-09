package com.programming.techie.springredditclone.service;

import com.programming.techie.springredditclone.model.RefreshToken;

public interface RefreshTokenService {

    RefreshToken generateRefreshToken();
    void validateRefreshToken(String token);
    void deleteRefreshToken(String token);
}
