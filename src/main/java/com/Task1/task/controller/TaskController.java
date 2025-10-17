package com.Task1.task.controller;

import com.Task1.task.dto.TaskDTO;
import com.Task1.task.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TaskTracker")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping("/add")
    public String addTask(@RequestBody TaskDTO taskDTO) {
        TaskDTO response = taskService.addTask(taskDTO);
        return "Task added successfully";
    }

    @PutMapping("/updateById/{id}")
    public TaskDTO updateTask(@PathVariable String id, @RequestBody TaskDTO taskDTO) {
        return taskService.updateTask(id, taskDTO);
    }

    @DeleteMapping("/deleteBy/{id}")
    public String deleteTask(@PathVariable String id) {
        return taskService.deleteTask(id);

    }

    @PutMapping("/updateStatus/{id}")
    public TaskDTO updateStatus(@PathVariable String id, @RequestBody TaskDTO taskDTO) {
        return taskService.updateStatus(id, taskDTO);
    }

    @GetMapping("/getAll")
    public List<TaskDTO> getAllTasks() {
        return taskService.listAllTasks();
    }

    @GetMapping("/getAllDone")
    public List<TaskDTO> getAllDone() {
        return taskService.doneTaskList();
    }

    @GetMapping("/getAllInProgress")
    public List<TaskDTO> getAllInProgress() {
        return taskService.inProgressTaskList();
    }

    @GetMapping("/getAllTodo")
    public List<TaskDTO> getAllTodo() {

        return taskService.toDoTaskList();
    }
}
