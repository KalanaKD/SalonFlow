package com.kd.SalonFlow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReviewDTO  {
    private int reviewId;
    private StaffDTO staffId;     // Or StaffDTO
    private UserDTO userId;      // Or UserDTO
    private ServiceDTO serviceId;   // Or ServiceDTO
    private double rating;
}
