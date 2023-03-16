package com.example.LoggerApp.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ChangeDto {

    private UUID id;
    private LocalDateTime changedDate;
    private String changedBy;
    private String parameterName;
    private double parameterOldValue;
    private double parameterNewValue;

}
