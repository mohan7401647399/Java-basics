package com.example.demo.DTO;

import com.example.demo.model.Comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {

	private int commentId;
	
	private String comment;
}
