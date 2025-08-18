package com.kd.SalonFlow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceDTO {
    private int serviceId;
    private String serviceName;
    private String serviceDescription;
    private String category;
    private boolean active;  // true = available, false = unavailable
    private double price;
}
