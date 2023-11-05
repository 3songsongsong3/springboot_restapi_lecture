package com.example.spring_lecture;

import com.example.spring_lecture.ioc.ApplicationContextProvider;
import com.example.spring_lecture.ioc.Base64Encoder;
import com.example.spring_lecture.ioc.Encoder;
import com.example.spring_lecture.ioc.UrlEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLectureApplication.class, args);
		// 스프링 어플리케이션이 시작되고 나서 App Context 직접 초기화
		ApplicationContext context = ApplicationContextProvider.getContext();

		Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
		UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

		Encoder encoder = new Encoder(base64Encoder);

		String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
		String result = encoder.encode(url);
		System.out.println("result1 : " + result);

		encoder.setIEncoder(urlEncoder);
		result = encoder.encode(url);
		System.out.println("result2 : " + result);

	}

}
