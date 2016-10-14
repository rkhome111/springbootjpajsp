package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
public class SpringbootjpajspApplicationTests {

	@Test
	public void contextLoads() {
		
		RestTemplate temp = new RestTemplate();
		System.out.println(temp.getForObject("http://localhost:8080/get", User.class));
		ResponseEntity<User> user = temp.getForEntity("http://localhost:8080/get", User.class);
		System.out.println(user.getStatusCodeValue());
		System.out.println(user.getBody());
	}

}
