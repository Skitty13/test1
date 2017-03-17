package com.polytech.repository;

import com.polytech.business.Post;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Utilisateur on 13/03/2017.
 */


@Repository
public class JdbcPostReposit implements PostReposit {

    private final DataSource dataSource;

    public JdbcPostReposit(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Post> findAll() {
        List<Post> posts = new ArrayList<Post>();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement preparedstatement = connection.prepareStatement(" SELECT * FROM POST");
            ResultSet resultSet = preparedstatement.executeQuery();
            while (resultSet.next()) {
                posts.add(new Post(resultSet.getString("CONTENT")));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return posts;
    }

    public void save(Post post) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedstatement = connection.prepareStatement(" INSERT INTO POST (CONTENT) VALUES(?)");
            preparedstatement.setString(1, post.getContent());
            preparedstatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}



