package com.shiv.service;

import com.shiv.model.Topic;
import com.shiv.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    TopicRepository topicRepository;
    public List<Topic> getTopics(){
        List<Topic> topicList = new ArrayList<>();
        topicRepository.findAll().forEach(topicList::add);
        return topicList;
    }

    public Topic getTopic(int id) {
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(int id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
        topicRepository.deleteById(id);
    }

    public List<Topic> getTopicByName(String name) {
        return topicRepository.findByName(name);
    }
//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic(1,"topic1"),
//            new Topic(2,"topic2")
//    ));
//    public List<Topic> getTopics(){
//        return topics;
//    }
//
//    public Topic getTopic(int id) {
//        return topics.stream().filter(t->
//                t.getId()==id).findFirst().get();
//    }
//
//    public void addTopic(Topic topic) {
//        topics.add(topic);
//    }
//
//    public void updateTopic(int id, Topic topic) {
//        for (Topic t:topics)
//        {
//            if(id==t.getId()) {
//                topics.set(id, topic);
//                return;
//            }
//        }
//    }
//
//    public void deleteTopic(int id) {
//        topics.removeIf(t-> t.getId()==id);
//    }
}
