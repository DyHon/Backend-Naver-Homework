package com.likelion.threetier.user.service;

import com.likelion.threetier.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getUsers();
}
