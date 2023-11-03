package com.example.spring_lecture;

import com.example.spring_lecture.rest_api.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringLectureApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("---------");

		var objectMapper = new ObjectMapper();

		// Object -> text(json)
		// object mapper get method를 활용한다.
		var user = new User("song",32);
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		// text(json) -> Object
		// default 생성자가 있어야 정상 작동
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);
	}

}
