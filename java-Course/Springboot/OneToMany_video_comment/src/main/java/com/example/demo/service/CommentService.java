package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CommentDTO;
import com.example.demo.model.Comment;
import com.example.demo.model.Video;
import com.example.demo.repository.CommentRepo;
import com.example.demo.repository.VideoRepo;

@Service
public class CommentService {

	@Autowired
	private CommentRepo commentRepo;

	@Autowired
	private VideoRepo videoRepo;

	// convert -> Entity to DTO
	public CommentDTO EntityToDTO(Comment comment) {
		//	create video DTO object
		CommentDTO dto = new CommentDTO();

		dto.setCommentId(comment.getCommentId());
		dto.setComment(comment.getComment());

		dto.setVideoId(comment.getVideo().getVideoId());

		return dto;
	}

	// create comment
	public CommentDTO createComment(CommentDTO dto) {
		// create comment entity
		Comment comment = new Comment();

		comment.setComment(dto.getComment());

		// Video entity
		Video v1 = videoRepo.findById(dto.getVideoId()).orElseThrow(() -> new RuntimeException("No video found"));

		comment.setVideo(v1);

		// save into comment entity
		Comment savedComment = commentRepo.save(comment);

		return EntityToDTO(savedComment);
	}

	// get all comments
	public List<CommentDTO> getAllComments() {
		// return converted entity
		return commentRepo.findAll().stream().map(this::EntityToDTO).toList();
	}

	// get a comment
	public CommentDTO getComment(int id) {
		// get comment entity with id
		Comment c1 = commentRepo.findById(id).orElseThrow(() -> new RuntimeException("no comment found " + id));

		return EntityToDTO(c1);
	}

	// update a comment
	public CommentDTO updateComment(int id, CommentDTO dto) {
		// get comment entity with id
		Comment comment = commentRepo.findById(id).orElseThrow(() -> new RuntimeException("no comment found " + id));

		comment.setComment(dto.getComment());

		if (dto.getVideoId() != comment.getVideo().getVideoId()) {
			Video video = videoRepo.findById(dto.getVideoId())
					.orElseThrow(() -> new RuntimeException("video not found"));
			comment.setVideo(video);
		}
		
		// save into comment entity
		Comment savedComment = commentRepo.save(comment);

		return EntityToDTO(savedComment);
	}

	// delete a comment
	public String deleteComment(int id) {
		// get comment entity with id
		Comment comment = commentRepo.findById(id).orElseThrow(() -> new RuntimeException("no comment found " + id));

		commentRepo.delete(comment);

		return "comment has been deleted";
	}
}
