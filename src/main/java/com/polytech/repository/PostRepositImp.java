package com.polytech.repository;

import com.polytech.business.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Utilisateur on 13/03/2017.
 */
public class PostRepositImp implements PostReposit {

    List<Post> db = new ArrayList<Post>();


    public List<Post> findAll() {
        return db;
    }

    public void save(Post post) {
        this.db.add(post);
    }


}
