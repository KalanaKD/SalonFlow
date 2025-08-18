package com.kd.SalonFlow.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int serviceId;
    private String serviceName;
    private String serviceDescription;
    private String category;
    private boolean active;  //available or unavailable
    private double price;

    @OneToMany(mappedBy = "service")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "service")
    private List<Review> reviews;

}
