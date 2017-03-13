package com.polytech.business;

import com.polytech.repository.PostRepository;

import java.util.List;

/**
 * Created by Utilisateur on 13/03/2017.
 */
public class PublicationService {

    private PostRepository postRepository;

    public PublicationService(PostRepository repository) {
        this.postRepository = repository;
    }

    public void post(Post post) {
        this.postRepository.save(post);
    }


    public List<Post> fetchAll(){
        return this.postRepository.findAll();
    }

}
