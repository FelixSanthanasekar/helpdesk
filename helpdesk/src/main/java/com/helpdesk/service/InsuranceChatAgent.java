package com.helpdesk.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.api.OllamaApi;
import org.springframework.stereotype.Service;

@Service
public class InsuranceChatAgent {

    private final ChatClient chatClient;

    public InsuranceChatAgent(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String processClaim(String claimDetails) {
        String prompt = "You are an insurance claims assistant. Given these details: " + claimDetails +
                " Provide a claim category and next steps.";
        OllamaApi.ChatResponse response = chatClient.call(new Prompt(prompt));
        return response.getResult().getOutput().getContent();
    }
}
