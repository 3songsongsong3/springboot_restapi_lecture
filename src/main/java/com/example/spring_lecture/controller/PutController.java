package com.example.spring_lecture.controller;

import com.example.spring_lecture.dto.PostRequestDTO;
import com.example.spring_lecture.dto.PutRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutController {

    // return 타입 : 스프링 부트에서 반환하면 알아서 JSON 객체로 반환하는듯
    @PutMapping("/put/{userId}")
    public PutRequestDTO put(@RequestBody PutRequestDTO putRequest, @PathVariable(name = "userId") Long id) {
        System.out.println(putRequest.toString());
        return putRequest;
    }
}
