package com.likelion.threetier.user.controller;

import com.likelion.threetier.user.model.User;
import com.likelion.threetier.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("")
    public String homePage(Model htmlPage)
    {
        List<User> users = (List<User>) userService.getUsers();
        htmlPage.addAttribute("users", users);
        return "index";

    }

}
