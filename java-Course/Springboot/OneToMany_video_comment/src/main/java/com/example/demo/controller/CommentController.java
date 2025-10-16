package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CommentDTO;
import com.example.demo.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentService commentService;

	// create comment
	@PostMapping("/create")
	public CommentDTO createComment(@RequestBody CommentDTO dto) {
		return commentService.createComment(dto);
	}

	// get all comments
	@GetMapping("/getAll")
	public List<CommentDTO> getAllComments() {
		return commentService.getAllComments();
	}

	// get comment
	@GetMapping("get/{id}")
	public CommentDTO getComment(@PathVariable int id) {
		return commentService.getComment(id);
	}

	// update comment
	@PutMapping("/update/{id}")
	public CommentDTO updateVideo(@PathVariable int id, @RequestBody CommentDTO dto) {
		return commentService.updateComment(id, dto);
	}

	// delete video
	@DeleteMapping("/delete/{id}")
	public String deleteVideo(@PathVariable int id) {
		return commentService.deleteComment(id);
	}
}