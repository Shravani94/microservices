package com.example.HibernateAssociations.oneToManyAssociation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;


    public Post addPost(Post post){
       return postRepository.save(post);
    }

    public UserDTO getUserByPostId(int id){
        return postRepository.getUserByPostId(id);
    }

    public List<PostDTO> getPostsByUserName(String userName){
        return postRepository.getPostsByUserName(userName);
    }

    public User getUserWithPost(String name){
        return postRepository.getUserWithPost(name);
    }

    public String addPosts(int userId, List<Post> newPosts){
        User user = userRepository.findById(userId).orElseThrow(()->new RuntimeException("user not found with "+userId));
        for (Post post: newPosts){
            post.setUser(user);
        }
        postRepository.saveAll(newPosts);
        return "new post added successfully";
    }
}
