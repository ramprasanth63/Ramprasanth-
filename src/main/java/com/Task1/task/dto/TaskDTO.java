package com.Task1.task.dto;

import com.Task1.task.enums.TaskEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TaskDTO {
    private String id;
    private String description;
    private TaskEnum status;
    private String createadAt;
    private String updateat;

}
