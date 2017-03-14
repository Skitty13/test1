package com.polytech.view;

import com.polytech.business.Post;
import com.polytech.business.PublicationService;
import com.polytech.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by Utilisateur on 13/03/2017.
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        PublicationService publicationService= applicationContext.getBean(PublicationService.class);

        Post post = new Post("Luminy est cool");
        publicationService.post(post);

        publicationService.post( new Post("Bonjour !"));

        List<Post> posts = publicationService.fetchAll();
        System.out.println(posts);

    }
}
