package com.Spring_AI.ollama;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.ai.ollama.api.OllamaChatOptions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaCustomController {

	@GetMapping("/custom/chat")
	public String getCustomChatMessage(@RequestParam String query) {
		
		OllamaApi ollamaApi = OllamaApi.builder().build();
		System.out.println("ollamaApi " + ollamaApi.toString());
		
		OllamaChatModel ollamaChatModel = OllamaChatModel.builder()
											.ollamaApi(ollamaApi)
											.defaultOptions(
													OllamaChatOptions.builder().model("gpt-oss:120b-cloud").build()
												).build();
		System.out.println("ollamaChatModel " + ollamaChatModel.toString());
		return ollamaChatModel.call(query);
	}
}
