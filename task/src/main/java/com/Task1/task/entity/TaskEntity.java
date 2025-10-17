package com.Task1.task.entity;

import com.Task1.task.enums.TaskEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskEntity {
    @Id
    private String id;
    private String description;
    private TaskEnum status;
    private String createdAt;
    private String updateDAt;
}
