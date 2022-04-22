package com.example.corsi.service;


import com.example.europcarfatture.entity.User;



public interface UserService  {

    User findById(Long id);

    void delete(Long id);

    User save(User user);
}
