package com.kd.SalonFlow.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewId;
    private double rating;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable=false)
    private Staff staffId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable=false)
    private User userId;

    @ManyToOne
    @JoinColumn(name = "service_id" , nullable=false)
    private Service serviceId;

}
