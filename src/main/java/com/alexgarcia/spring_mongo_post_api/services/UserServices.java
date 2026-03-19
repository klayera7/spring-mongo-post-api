package com.alexgarcia.spring_mongo_post_api.services;

import com.alexgarcia.spring_mongo_post_api.domain.User;
import com.alexgarcia.spring_mongo_post_api.repository.UserRepository;
import com.alexgarcia.spring_mongo_post_api.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        User user = repo.findById(id).orElse(null);
        if (user == null) {
            throw  new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }
}
