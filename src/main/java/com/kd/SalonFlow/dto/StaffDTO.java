package com.kd.SalonFlow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StaffDTO {
    private int staffId;
    private UserDTO userId;   // Or you can embed a UserDTO instead of just ID
    private String specialities;
    private String availableDays;
    private String availableHours;
    private String experience;
}
