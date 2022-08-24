package com.likelion.threetier.user.controller;

import com.likelion.threetier.user.model.User;
import com.likelion.threetier.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public String homePage(Model htmlPage)
    {
        List<User> users = (List<User>) userService.getUsers();
        htmlPage.addAttribute("users", users);
        return "index";

    }

    @GetMapping(value = "/{userId}")
    public String getUserById(Model htmlPage, @PathVariable(name = "userId") Integer userId) {
        System.out.println("ccc");
        User user = userService.getUserById(userId);
        htmlPage.addAttribute("user", user);
        return "user_page";
    }
}
