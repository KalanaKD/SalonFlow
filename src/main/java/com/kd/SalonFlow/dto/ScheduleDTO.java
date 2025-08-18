package com.kd.SalonFlow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO {
    private int scheduleId;
    private StaffDTO staffId;   // Or StaffDTO
    private String startTime;
    private String endTime;
}
