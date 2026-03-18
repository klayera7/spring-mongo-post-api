package com.alexgarcia.spring_mongo_post_api.services;

import com.alexgarcia.spring_mongo_post_api.domain.User;
import com.alexgarcia.spring_mongo_post_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
