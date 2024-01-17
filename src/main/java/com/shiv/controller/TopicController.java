package com.shiv.controller;

import com.shiv.model.Topic;
import com.shiv.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/topicsbyname/{topic_name}")
    public List<Topic> getTopicByName(@PathVariable("topic_name") String name)
    {
        return topicService.getTopicByName(name);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT,path = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable int id)
    {
        topicService.updateTopic(id,topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,path = "/topics/{id}")
    public void deleteTopic(@PathVariable int id)
    {
        topicService.deleteTopic(id);
    }

}
