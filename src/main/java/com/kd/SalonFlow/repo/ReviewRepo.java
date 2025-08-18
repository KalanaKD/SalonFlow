package com.kd.SalonFlow.repo;

import com.kd.SalonFlow.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepo extends JpaRepository<Review,Integer> {
}
