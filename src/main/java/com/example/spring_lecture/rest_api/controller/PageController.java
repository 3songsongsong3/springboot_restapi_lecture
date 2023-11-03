package com.example.spring_lecture.rest_api.controller;

import com.example.spring_lecture.rest_api.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User();
        user.setName("song");
        user.setAddress("daejeon");
        return user;
    }
}
