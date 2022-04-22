package com.example.corsi.service;


import com.example.corsi.entity.Role;



public interface RoleService  {

    Role findById(Integer id);

    void delete(Integer id);

    Role save(Role role);
}