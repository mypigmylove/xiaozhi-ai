package com.young.javaailangchain4j.controller;

import com.young.javaailangchain4j.agent.XiaozhiAgent;
import com.young.javaailangchain4j.model.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Tag(name = "硅谷小智")
@RestController
@RequestMapping("/xiaozhi")
public class XiaozhiController {

    @Autowired
    private XiaozhiAgent agent;

    @Operation(summary = "对话")
    @PostMapping("/chat")
    public Flux<String> chat(@RequestBody ChatForm chatForm) {

        return agent.chat(chatForm.getMemoryId(), chatForm.getMessage());

    }
}
