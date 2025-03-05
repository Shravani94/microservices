package com.example.HibernateAssociations.oneToManyAssociation;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
    @Query("SELECT new com.example.HibernateAssociations.oneToManyAssociation.UserDTO(p.user.id, p.user.name) FROM Post p where p.id =:postId")
     UserDTO getUserByPostId(@Param("postId") int postId);

    @Query("SELECT new com.example.HibernateAssociations.oneToManyAssociation.PostDTO(p.id,p.title, p.content) FROM Post p where p.user.name =:userName")
    List<PostDTO> getPostsByUserName(@Param("userName") String userName);

    //using JOIN FETCH method
    @Query("select u from User u JOIN FETCH u.posts WHERE u.name =:name")
    User getUserWithPost(@Param("name")String name);

}
