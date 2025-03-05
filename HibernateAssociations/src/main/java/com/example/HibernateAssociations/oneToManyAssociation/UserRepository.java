package com.example.HibernateAssociations.oneToManyAssociation;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

     User findByName(String name);

     //using ENTITY GRAPH method
     @EntityGraph(attributePaths = {"posts"})
     @Query("select u from User u  WHERE u.name =:name")
     User getUserWithPostByEntityGraph(@Param("name")String name);
}
