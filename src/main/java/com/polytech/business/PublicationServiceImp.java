package com.polytech.business;

import com.polytech.repository.PostReposit;

import java.util.List;

/**
 * Created by Utilisateur on 13/03/2017.
 */
public class PublicationServiceImp implements PublicationService {

    private PostReposit postRepository;

    public PublicationServiceImp(PostReposit repository) {
        this.postRepository = repository;
    }

    public void post(Post post) {
        this.postRepository.save(post);
    }


    public List<Post> fetchAll(){
        return this.postRepository.findAll();
    }

}
