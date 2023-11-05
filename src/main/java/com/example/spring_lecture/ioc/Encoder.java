package com.example.spring_lecture.ioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Encoder {
    private IEncoder iEncoder;

    /*
    비효율적인 코드
    public Encoder() {
        // 둘 중 선택
        // this.iEncoder = new Base64Encoder();
        this.iEncoder = new UrlEncoder();
    }*/
    public Encoder(IEncoder encoder) {
        // 둘 중 선택
        // this.iEncoder = new Base64Encoder();
        this.iEncoder = encoder;
    }
    public void setIEncoder(IEncoder encoder) {
        this.iEncoder = encoder;
    }
    public String encode(String message) {
        return iEncoder.encode(message);
    }
}

