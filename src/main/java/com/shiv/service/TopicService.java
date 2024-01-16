package com.shiv.service;

import com.shiv.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1,"topic1"),
            new Topic(2,"topic2")
    ));
    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(int id) {
        return topics.stream().filter(t->
                t.getId()==id).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(int id, Topic topic) {
        for (Topic t:topics)
        {
            if(id==t.getId()) {
                topics.set(id, topic);
                return;
            }
        }
    }

    public void deleteTopic(int id) {
        topics.removeIf(t-> t.getId()==id);
    }
}
