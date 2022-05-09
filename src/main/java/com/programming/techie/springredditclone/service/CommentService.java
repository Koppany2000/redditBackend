package com.programming.techie.springredditclone.service;

import com.programming.techie.springredditclone.dto.CommentsDto;

import java.util.List;

public interface CommentService {

    void save(CommentsDto commentsDto);
    List<CommentsDto> getAllCommentsForPost(Long postId);
    List<CommentsDto> getAllCommentsForUser(String userName);
    boolean containsSwearWords(String comment);

}
