package com.shiv.repository;

import com.shiv.model.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
    public List<Topic> findByName(String name);
}
