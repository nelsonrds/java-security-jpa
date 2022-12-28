package dev.nelson.securityjpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.nelson.securityjpa.model.Post;
import dev.nelson.securityjpa.repository.PostRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    
    private final PostRepository postRepository;

    @GetMapping
    public List<Post> findAll(){
        return postRepository.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post){
        return post;
    }
}
