package com.example.spring_lecture.ioc;

import java.net.URLEncoder;

public class Main {

    public static void main(String[] args) {

        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding

        // url encoding
        // 사용하는 객체를 외부에서 주입 받음 (DI)
        //Encoder encoder = new Encoder(new Base64Encoder());
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);

        /*IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);*/

        System.out.println("result : " + result);
    }
}
