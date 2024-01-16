package com.shiv.service;

import com.shiv.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic(1,"topic1"),
            new Topic(2,"topic2")
    );
    public List<Topic> getTopics(){
        return topics;
    }
}
