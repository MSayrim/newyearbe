package com.example.newyear.repository;

import com.example.newyear.entity.LotteryNumber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotteryNumberRepository  extends JpaRepository<LotteryNumber,Long> {
}

