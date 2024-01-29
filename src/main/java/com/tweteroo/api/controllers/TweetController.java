package com.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.repository.TweetRepositore;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    final TweetRepositore tweetRepositore;

    TweetController(TweetRepositore tweetRepositore) {
        this.tweetRepositore = tweetRepositore;
    }

    @GetMapping
    public List<TweetModel> getTweets() {
        List<TweetModel> tweets = tweetRepositore.findAll();
        return tweets;
    }
    
}
