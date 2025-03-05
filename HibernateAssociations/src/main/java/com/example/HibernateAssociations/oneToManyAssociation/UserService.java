package com.example.HibernateAssociations.oneToManyAssociation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public User addUser(User user){
        for (Post post : user.getPosts()) {
            post.setUser(user);
        }
        return userRepository.save(user);
    }

    public Optional<User> getUserById(int id) {
        return userRepository.findById(id);
    }
    public User findByUserName(String name){
        return userRepository.findByName(name);
    }
}
