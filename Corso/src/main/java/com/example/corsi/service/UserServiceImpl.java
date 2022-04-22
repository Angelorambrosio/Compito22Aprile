package com.example.corsi.service;

import com.example.europcarfatture.entity.User;
import com.example.europcarfatture.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User findById(Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }


    @Override
    public void delete(Long id){
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
