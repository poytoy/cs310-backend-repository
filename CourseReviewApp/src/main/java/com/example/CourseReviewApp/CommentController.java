package com.example.CourseReviewApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Service.CourseService;
import model.Comment;
import model.Course;
import model.User;
import repo.CommentRepository;
import repo.UserRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Comment")

public class CommentController {

private final CommentRepository commentRepository;

public CommentController(CommentRepository commentRepository) {
    this.commentRepository = commentRepository;
}

@GetMapping("/getComments/{courseId}")
public List<Comment> getCommentsForClass(@PathVariable("courseId") String code) {
    try {
        List<Comment> comments = commentRepository.findByCourseId(code);
        return comments;
    } catch (Exception e) {
        // Log the exception for debugging purposes
        e.printStackTrace();

        // Return an error response or an empty list, depending on your requirements
        return Collections.emptyList(); // Empty list as an example, you can customize this based on your needs
    }
}
@PostMapping("/postComment")
public ResponseEntity<String> postComment(@RequestBody Comment comment) {
		    try {
		        // Retrieve user from the database based on the provided username

		        // Set the user in the comment
		    	Comment com = new Comment(comment.getCourseId(), comment.getCourseName(), comment.getComment());
		    	// ID will be generated by MongoDB when you save the comment
		    	commentRepository.save(com);

		        return new ResponseEntity<>("Comment posted successfully", HttpStatus.OK);
		    } catch (Exception e) {
		        // Log the exception for debugging purposes
		        e.printStackTrace();

		        // Return an error response, you can customize this based on your needs
		        return new ResponseEntity<>("Failed to post comment", HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		}
}