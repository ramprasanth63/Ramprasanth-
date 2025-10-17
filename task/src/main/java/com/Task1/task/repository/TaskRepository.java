package com.Task1.task.repository;


import com.Task1.task.entity.TaskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<TaskEntity,String> {

}
