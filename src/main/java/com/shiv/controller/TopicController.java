package com.shiv.controller;

import com.shiv.model.Topic;
import com.shiv.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopics();
    }
    @RequestMapping("/topics/{topic_id}")
    public Topic getTopic(@PathVariable("topic_id") int id)
    {
        return topicService.getTopic(id);
    }
}
