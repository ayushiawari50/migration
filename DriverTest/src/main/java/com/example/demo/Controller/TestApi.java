package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

	@RequestMapping("/welcome")
	public String test() {
		return "Hey I am Running!!";
	}
}
