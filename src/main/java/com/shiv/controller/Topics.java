package com.shiv.controller;

import com.shiv.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Topics {
    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return Arrays.asList(
                new Topic(1,"topic1"),
                new Topic(2,"topic2")
        );
    }
}
