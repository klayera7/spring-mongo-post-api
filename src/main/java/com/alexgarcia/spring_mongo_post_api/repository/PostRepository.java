package com.alexgarcia.spring_mongo_post_api.repository;

import com.alexgarcia.spring_mongo_post_api.domain.Post;
import com.alexgarcia.spring_mongo_post_api.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
