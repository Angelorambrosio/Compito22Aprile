package com.example.corsi.service;

import com.example.europcarfatture.entity.Role;
import com.example.europcarfatture.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleRepository roleRepository;

    @Override
    public Role findById(Integer id) {
        Role role= roleRepository.findById(id).get();
        return role;
    }


    @Override
    public void delete(Integer id){
        Role role = roleRepository.findById(id).get();
        roleRepository.delete(role);
    }


    @Override
    public Role save(Role role) {
        return null;
    }

}
