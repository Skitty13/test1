package com.polytech.view;

import com.polytech.business.Post;
import com.polytech.repository.PostReposit;
import com.polytech.repository.PostRepositImp;
import com.polytech.business.PublicationServiceImp;

import java.util.List;

/**
 * Created by Utilisateur on 13/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Coucou Polytech");

        PostReposit repository = new PostRepositImp();
        PublicationServiceImp publicationservice = new PublicationServiceImp(repository);

        Post post = new Post("Luminy est cool");
        publicationservice.post(post);

        List<Post> posts = publicationservice.fetchAll();
        System.out.println(post);

    }
}
