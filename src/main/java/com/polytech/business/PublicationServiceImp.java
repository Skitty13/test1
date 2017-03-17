package com.polytech.business;

import com.polytech.repository.PostReposit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Utilisateur on 13/03/2017.
 */

@Service
public class PublicationServiceImp implements PublicationService {

    private PostReposit postRepository;

    @Autowired
    public PublicationServiceImp(PostReposit postRepository) {
        this.postRepository = postRepository;
    }

    public void post(Post post) {
        this.postRepository.save(post);
    }

    public List<Post> fetchAll() {
        return postRepository.findAll();
    }

}
