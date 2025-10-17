package com.Task1.task.service;

import com.Task1.task.dto.TaskDTO;
import com.Task1.task.entity.TaskEntity;
import com.Task1.task.enums.TaskEnum;
import com.Task1.task.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskDTO addTask(TaskDTO taskDTO) {
        TaskEntity taskEntity = TaskEntity.builder()
                .id(taskDTO.getId())
                .description(taskDTO.getDescription())
                .status(taskDTO.getStatus())
                .createdAt(taskDTO.getCreateadAt())
                .updateDAt(taskDTO.getUpdateat())
                .build();
        taskRepository.save(taskEntity);
        return TaskDTO.builder()
                .id(taskEntity.getId())
                .description(taskEntity.getDescription())
                .status(taskEntity.getStatus())
                .createadAt(taskEntity.getCreatedAt())
                .updateat(taskEntity.getUpdateDAt())
                .build();
    }


    public TaskDTO updateTask(String id, TaskDTO taskDTO) {
        TaskEntity taskEntity = taskRepository.findById(id).orElseThrow();
        taskEntity.setDescription(taskDTO.getDescription());
        taskEntity.setStatus(taskDTO.getStatus());
        //taskEntity.setCreatedAt(taskDTO.getCreateadAt());
        taskEntity.setUpdateDAt(taskDTO.getUpdateat());
        taskRepository.save(taskEntity);
        return TaskDTO.builder()
                .id(taskEntity.getId())
                .description(taskEntity.getDescription())
                .status(taskEntity.getStatus())
                //.createdAt(taskEntity.getCreatedAt())
                .updateat(taskEntity.getUpdateDAt())
                .build();
    }

    public String deleteTask(String id) {
        TaskEntity taskEntity = taskRepository.findById(id).orElseThrow();
        taskRepository.delete(taskEntity);
        return "Task deleted";
    }

    public TaskDTO updateStatus(String id, TaskDTO taskDTO) {
        TaskEntity taskEntity = taskRepository.findById(id).orElseThrow();
        taskEntity.setStatus(taskDTO.getStatus());
        taskRepository.save(taskEntity);
        return TaskDTO.builder()
                .id(taskEntity.getId())
                .description(taskEntity.getDescription())
                .status(taskEntity.getStatus())
                //.createdAt(taskEntity.getCreatedAt())
                .updateat(taskEntity.getUpdateDAt())
                .build();
    }
    public List<TaskDTO> listAllTasks() {
        List<TaskEntity> taskEntityList = taskRepository.findAll();
        List<TaskDTO> taskDTOList = new ArrayList<>();
        for (TaskEntity taskEntity : taskEntityList) {
            taskDTOList.add(TaskDTO.builder()
                    .id(taskEntity.getId())
                    .description(taskEntity.getDescription())
                    .status(taskEntity.getStatus())
                    .createadAt(taskEntity.getCreatedAt())
                    .updateat(taskEntity.getUpdateDAt())
                    .build());
        }
        return taskDTOList;
    }


    public List<TaskDTO> doneTaskList() {
        List<TaskEntity> taskEntityList = taskRepository.findAll();
        List<TaskDTO> taskDTOList = new ArrayList<>();

        for (TaskEntity taskEntity : taskEntityList) {
            if (taskEntity.getStatus() == TaskEnum.DONE) {
                TaskDTO taskDTO = TaskDTO.builder()
                        .id(taskEntity.getId())
                        .description(taskEntity.getDescription())
                        .status(taskEntity.getStatus())
                        .createadAt(taskEntity.getCreatedAt())
                        .updateat(taskEntity.getUpdateDAt())
                        .build();
                taskDTOList.add(taskDTO);
            }
        }
        return taskDTOList;
    }


    public List<TaskDTO> toDoTaskList() {
        List<TaskEntity> taskEntityList = taskRepository.findAll();
        List<TaskDTO> taskDTOList = new ArrayList<>();

        for (TaskEntity taskEntity : taskEntityList) {
            if (taskEntity.getStatus() == TaskEnum.TODO) {
                TaskDTO taskDTO = TaskDTO.builder()
                        .id(taskEntity.getId())
                        .description(taskEntity.getDescription())
                        .status(taskEntity.getStatus())
                        .createadAt(taskEntity.getCreatedAt())
                        .updateat(taskEntity.getUpdateDAt())
                        .build();
                taskDTOList.add(taskDTO);
            }
        }
        return taskDTOList;
    }


    public List<TaskDTO> inProgressTaskList() {
        List<TaskEntity> taskEntityList = taskRepository.findAll();
        List<TaskDTO> taskDTOList = new ArrayList<>();

        for (TaskEntity taskEntity : taskEntityList) {
            if (taskEntity.getStatus() == TaskEnum.INPROGRESS) {
                TaskDTO taskDTO = TaskDTO.builder()
                        .id(taskEntity.getId())
                        .description(taskEntity.getDescription())
                        .status(taskEntity.getStatus())
                        .createadAt(taskEntity.getCreatedAt())
                        .updateat(taskEntity.getUpdateDAt())
                        .build();
                taskDTOList.add(taskDTO);
            }
        }
        return taskDTOList;
    }
}