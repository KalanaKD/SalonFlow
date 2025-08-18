package com.kd.SalonFlow.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int scheduleId;
    private int staffId;
    private String startTime;
    private String endTime;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable=false)
    private Staff staff;

}
