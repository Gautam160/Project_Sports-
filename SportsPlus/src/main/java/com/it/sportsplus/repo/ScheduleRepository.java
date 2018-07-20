package com.it.sportsplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.it.sportsplus.models.Schedule;
public interface ScheduleRepository extends JpaRepository<Schedule,Long> {

}
