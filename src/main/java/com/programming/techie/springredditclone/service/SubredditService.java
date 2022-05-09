package com.programming.techie.springredditclone.service;

import com.programming.techie.springredditclone.dto.SubredditDto;

import java.util.List;

public interface SubredditService {
    SubredditDto save(SubredditDto subredditDto);
    List<SubredditDto> getAll();
    SubredditDto getSubreddit(Long id);
}
