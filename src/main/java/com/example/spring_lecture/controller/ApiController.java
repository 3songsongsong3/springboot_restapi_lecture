package com.example.spring_lecture.controller;

import com.example.spring_lecture.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // 해당 클래스는 REST API 처리하는 Controller
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello spring boot";
    }

    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    // JSON
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user;
    }

    // 응답에 대한 커스터마이징이 필요할 때, ResponseEntity 사용 가능
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}


