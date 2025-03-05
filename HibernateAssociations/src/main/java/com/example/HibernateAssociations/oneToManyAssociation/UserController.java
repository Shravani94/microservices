package com.example.HibernateAssociations.oneToManyAssociation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/byName/{name}")
    public User getUserByName(@PathVariable String name){
        return userService.findByUserName(name);
    }

    @GetMapping("/post/{id}")
    public UserDTO getUserBuPostId(@PathVariable int id){
        return postService.getUserByPostId(id);
    }

    @GetMapping("/byUser/{userName}")
    public List<PostDTO> getPostsByUserName(@PathVariable String userName){
        return postService.getPostsByUserName(userName);
    }

    @GetMapping("/getByName/{name}")
    public User getUserWithPost(@PathVariable String name){
        return postService.getUserWithPost(name);
    }

    @GetMapping("/byUserName/{name}")
    public User getUserWithPostByEntityGraph(@PathVariable String name){
        return userRepository.getUserWithPostByEntityGraph(name);
    }

    @PostMapping("/{userId}/addPosts")
    public String addPosts(@PathVariable int userId, @RequestBody List<Post>post){
       return postService.addPosts(userId,post);

    }
}
