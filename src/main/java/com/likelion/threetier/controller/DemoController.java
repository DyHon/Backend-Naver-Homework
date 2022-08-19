package com.likelion.threetier.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage() {
        return " ";
    }
}
