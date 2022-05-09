package com.programming.techie.springredditclone.service;

import com.programming.techie.springredditclone.dto.PostRequest;
import com.programming.techie.springredditclone.dto.PostResponse;

import java.util.List;

public interface PostService {

    void save(PostRequest postRequest);
    PostResponse getPost(Long id);
    List<PostResponse> getAllPosts();
    List<PostResponse> getPostsBySubreddit(Long subredditId);
    List<PostResponse> getPostsByUsername(String username);
}
