package com.Spring_AI.ollama;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaController {

	@Autowired
	private OllamaChatModel chatModel;
	
	@GetMapping("/")
	public String getChatMessage() {
		return chatModel.call("Hello, Good Morning!!");
	}
	
	@GetMapping("/chat")
	public String getQueryChatMessage(@RequestParam String query) {
		return chatModel.call(query);
	}
}
