package com.alexgarcia.spring_mongo_post_api.resources;


import com.alexgarcia.spring_mongo_post_api.domain.Post;
import com.alexgarcia.spring_mongo_post_api.domain.User;
import com.alexgarcia.spring_mongo_post_api.dto.UserDTO;
import com.alexgarcia.spring_mongo_post_api.services.PostServices;
import com.alexgarcia.spring_mongo_post_api.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/posts")
public class PostResources {
    @Autowired
    private PostServices service;

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
