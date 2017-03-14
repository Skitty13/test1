package com.polytech.config;

import com.polytech.business.PublicationService;
import com.polytech.business.PublicationServiceImp;
import com.polytech.repository.JdbcPostReposit;
import com.polytech.repository.PostReposit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;


/**
 * Created by Utilisateur on 13/03/2017.
 */

@Configuration
public class ApplicationConfig {

    @Bean
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("create-schema.sql").build();
    }

    @Bean
    public PostReposit postRepository(){

        return new JdbcPostReposit(dataSource());
    }

    @Bean
    public PublicationService publicationService ( PostReposit postReposit){

        return new PublicationServiceImp(postReposit);
    }
}
