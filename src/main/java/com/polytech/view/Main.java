package com.polytech.view;

import com.polytech.business.Post;
import com.polytech.repository.PostRepository;
import com.polytech.business.PublicationService;

import java.util.List;

/**
 * Created by Utilisateur on 13/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Coucou Polytech");


        PostRepository repository = new PostRepository();
        PublicationService publicationservice = new PublicationService(repository);

        Post post = new Post("Luminy est cool");
        publicationservice.post(post);

        List<Post> posts = publicationservice.fetchAll();
        System.out.println(post);

    }
}
