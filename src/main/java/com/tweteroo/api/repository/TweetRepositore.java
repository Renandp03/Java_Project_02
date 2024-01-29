package com.tweteroo.api.repository;


import com.tweteroo.api.models.TweetModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepositore extends JpaRepository<TweetModel, Long>{
    
}
