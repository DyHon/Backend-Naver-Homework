package com.likelion.threetier.user.controller;

import com.likelion.threetier.user.model.User;
import com.likelion.threetier.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("")
    public List<User> homePage()
    {
        List<User> users=(List<User>) userService.getUsers();
        return users;

    }

}
