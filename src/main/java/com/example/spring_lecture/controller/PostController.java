package com.example.spring_lecture.controller;

import com.example.spring_lecture.dto.PostRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String, Object> requestData) {
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key  : " + stringObjectEntry.getKey());
            System.out.println("key  : " + stringObjectEntry.getValue());
        });
    }

    // DTO가 카멜케이스 Request가 스네이크일 경우는?
    // 또는 JSON key 값과 DTO 필드 명이 다를 경우
    // DTO 필드에 @JsonProperty("json key") 추가
    @PostMapping("/post02")
    public void post(@RequestBody PostRequestDTO requestData) {
        System.out.println(requestData.toString());
    }


}
