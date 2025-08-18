package com.kd.SalonFlow.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;
    private int status; //confirm(1) or not(0)

    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User userId;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable=false)
    private Staff staffId;

    @ManyToOne
    @JoinColumn(name = "service_id" , nullable=false)
    private Service serviceId;

}
