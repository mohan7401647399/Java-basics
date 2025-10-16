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

import com.example.demo.DTO.VideoDTO;
import com.example.demo.service.VideoService;

@RestController
@RequestMapping("/video")
public class VideoController {

	@Autowired
	private VideoService videoService;

	// create video
	@PostMapping("/create")
	public VideoDTO createVideo(@RequestBody VideoDTO dto) {
		return videoService.createVideo(dto);
	}

	// get all video
	@GetMapping("/getAll")
	public List<VideoDTO> getAllVideo() {
		return videoService.getAllVideos();
	}

	// get video
	@GetMapping("/get/{id}")
	public VideoDTO getVideo(@PathVariable int id) {
		return videoService.getVideo(id);
	}

	// update video
	@PutMapping("/update/{id}")
	public VideoDTO updateVideo(@PathVariable int id,@RequestBody VideoDTO dto) {
		return videoService.updateVideo(id, dto);
	}

	// delete a video
	@DeleteMapping("delete/{id}")
	public String deleteVideo(@PathVariable int id) {
		return videoService.deleteVideo(id);
	}
}
