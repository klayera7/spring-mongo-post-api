package com.alexgarcia.spring_mongo_post_api.services;

import com.alexgarcia.spring_mongo_post_api.domain.Post;
import com.alexgarcia.spring_mongo_post_api.domain.User;
import com.alexgarcia.spring_mongo_post_api.dto.UserDTO;
import com.alexgarcia.spring_mongo_post_api.repository.PostRepository;
import com.alexgarcia.spring_mongo_post_api.repository.UserRepository;
import com.alexgarcia.spring_mongo_post_api.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServices {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Post user = repo.findById(id).orElse(null);
        if (user == null) {
            throw  new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }


}
