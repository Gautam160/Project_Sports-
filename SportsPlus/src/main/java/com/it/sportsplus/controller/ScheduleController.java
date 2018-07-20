package com.it.sportsplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.sportsplus.models.Schedule;
import com.it.sportsplus.repo.ScheduleRepository;


@RestController
@RequestMapping("/schedule")

public class ScheduleController {
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	@PostMapping("/add")
	public Schedule addSchedule(@RequestBody Schedule schedule) {
		Schedule persistedSchedule= scheduleRepository.save(schedule);
		return persistedSchedule;
	}
	
	
	
	@GetMapping("/getAll")
	public List<Schedule> getAllSchedule(){
		List<Schedule> schedules=scheduleRepository.findAll();
		return schedules;
		
	}

	@DeleteMapping("/delete")
	public void deleteAcademy(@RequestBody Schedule schedule)
	{
		scheduleRepository.delete(schedule);
	}
	
}
