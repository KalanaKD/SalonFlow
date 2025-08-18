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
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int staffId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="user_id", referencedColumnName = "userId")
    private User user;
    private String specialities;
    private String availableDays;
    private String availableHours;
    private String experience;

    @OneToMany(mappedBy = "staff")
    private List<Review> reviews;

    @OneToMany(mappedBy = "staff")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "staff")
    private List<Schedule> schedules;


}
