package com.example.CourseReviewApp;

import model.Comment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repo.CommentRepository;
import repo.CommentRepository;

import java.util.Collections;
import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/Hello/sayHello
@RestController

@RequestMapping("/Hello")
public class HelloController {
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	//get and post
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello User, sdasd";
	}
}
	
