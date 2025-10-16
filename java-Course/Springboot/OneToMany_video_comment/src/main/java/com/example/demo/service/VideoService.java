package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CommentDTO;
import com.example.demo.DTO.VideoDTO;
import com.example.demo.model.Video;
import com.example.demo.repository.VideoRepo;

@Service
public class VideoService {

	@Autowired
	private VideoRepo videoRepo;

	// convert -> Entity to DTO
	public VideoDTO EntityToDTO(Video video) {
		//	create video DTO object
		VideoDTO dto = new VideoDTO();

		dto.setVideoId(video.getVideoId());
		dto.setVideoName(video.getVideoName());

		if (video.getComments() != null) {
			List<CommentDTO> comments = video.getComments().stream().map(cmt -> {
				CommentDTO c1 = new CommentDTO();

				c1.setCommentId(cmt.getCommentId());
				c1.setComment(cmt.getComment());
				c1.setVideoId(video.getVideoId());

				return c1;
			}).toList();
			dto.setComments(comments);
		}
		return dto;
	}

	// create a video
	public VideoDTO createVideo(VideoDTO dto) {
		// create video entity
		Video video = new Video();

		video.setVideoName(dto.getVideoName());

		return EntityToDTO(videoRepo.save(video));
	}

	// get all videos
	public List<VideoDTO> getAllVideos() {
		// return converted entity
		return videoRepo.findAll().stream().map(this::EntityToDTO).toList();
	}

	// get a video
	public VideoDTO getVideo(int id) {
		// get video entity with id
		Video v1 = videoRepo.findById(id).orElseThrow(() -> new RuntimeException("No video found"));
		
		return EntityToDTO(v1);
	}

	// update video
	public VideoDTO updateVideo(int id, VideoDTO dto) {
		// get video entity with id
		Video video = videoRepo.findById(id).orElseThrow(() -> new RuntimeException("no video found " + id));

		video.setVideoName(dto.getVideoName());
		
		return EntityToDTO(videoRepo.save(video));
	}

	// delete video
	public String deleteVideo(int id) {
		// get video entity with id
		Video video = videoRepo.findById(id).orElseThrow(() -> new RuntimeException("no video found " + id));
		videoRepo.delete(video);

		return "video has been deleted";
	}
}
