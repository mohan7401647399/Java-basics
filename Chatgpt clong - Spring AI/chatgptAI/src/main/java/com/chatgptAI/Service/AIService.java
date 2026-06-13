package com.chatgptAI.Service;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class AIService {

	private final OllamaChatModel chatModel;
	
	public AIService(OllamaChatModel ollamaChatModel) {
		this.chatModel = ollamaChatModel;
	}
	
	public String chat(String message) {
		
		try {
			if(message == null ) {
				return "Message cannot be empty";
			}
			
			Prompt prompt = new Prompt(message);
			
			String response = chatModel.call(prompt).getResult().getOutput().getText();
			
			return response;
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error communicating with AI model: " + e.getMessage();
		}
	}
}
