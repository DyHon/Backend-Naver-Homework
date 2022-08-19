package com.likelion.threetier.user.service.impl;

import com.likelion.threetier.user.model.User;
import com.likelion.threetier.user.repository.UserRepository;
import com.likelion.threetier.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository uRepo;

    @Override
    public List<User> getUsers() {
        return(List<User>) uRepo.findAll();
    }

}
