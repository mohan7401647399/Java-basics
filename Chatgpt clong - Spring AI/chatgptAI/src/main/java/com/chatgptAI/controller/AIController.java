package com.chatgptAI.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.chatgptAI.Service.AIService;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin("http://localhost:3000/")
public class AIController {

	@Autowired
	private AIService aiService;

	@PostMapping("/prompt")
	public ResponseEntity<?> chat(@RequestBody Map<String, String> req) {
		String prompt = req.get("prompt");

		String reply = aiService.chat(prompt);

		return ResponseEntity.ok(Map.of("response", reply));
	}

	@PostMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) throws Exception {
		String content = new String(file.getBytes());

		String answer = aiService.chat("Explain this content:\n " + content);

		return ResponseEntity.ok(Map.of("response", answer));
	}
}
