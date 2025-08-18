package com.kd.SalonFlow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class BookingDTO {
    private int bookingId;
    private UserDTO userId;
    private StaffDTO staffId;
    private ServiceDTO serviceId;
    private int status;
}
