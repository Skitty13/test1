package com.polytech.config;

import com.polytech.business.PublicationService;
import com.polytech.business.PublicationServiceImp;
import com.polytech.repository.PostReposit;
import com.polytech.repository.PostRepositImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static javax.security.auth.login.Configuration.configuration;

/**
 * Created by Utilisateur on 13/03/2017.
 */

@Configuration
public class ApplicationConfig {

    @Bean
    public PostReposit postRepository(){
        return new PostRepositImp();
    }

    @Bean
    public PublicationService publicationService ( PostReposit postReposit){

        return new PublicationServiceImp(postReposit);
    }
}
