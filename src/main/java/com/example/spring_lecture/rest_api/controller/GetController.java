package com.example.spring_lecture.rest_api.controller;

import com.example.spring_lecture.rest_api.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetController {

    @GetMapping(path = "/hello")
    public String getHello() {
        return "get Hello";
    }

    //@RequestMapping("/hi") // get / post / put /delete 에서 모두 작동
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get에서 모두 작동
    public String hi() {
        return "get Hi";
    }

    // http://localhost:8080/api/get/path-variable/{name}
    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name = "id") String pathName) {

        System.out.println("pathVariable : " + pathName);

        return pathName;
    }

    //
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+ " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping(path = "/query-param2")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age)
    {
        return name + " " + email + " " + age;
    }

    // DTO 방식, 현업에서 많이 씀
    @GetMapping(path = "/query-param3")
    public String queryParam03(UserRequest userRequest) {

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
