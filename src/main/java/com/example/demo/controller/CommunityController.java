package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Jobs;
import com.example.demo.model.Volunteers;
import com.example.demo.repo.JobsRepo;
import com.example.demo.repo.VolunteersRepo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CommunityController {
	
	@Autowired
	VolunteersRepo volunteerRepo;
	
	@Autowired
	JobsRepo jobsRepo;
	
	@RequestMapping("/getVolunteersByJobId/{id}")
	@ResponseBody
	public String getVolunteersByJobId(@PathVariable("id") int id) throws JsonProcessingException
	{
		 
		Jobs jobObj = jobsRepo.findById(id).orElse(new Jobs());
		
		 String result = new ObjectMapper().writerWithView(JsonViewProfiles.Jobs.class)
	                .writeValueAsString(jobObj);
		
		return result;
	}


	
	@RequestMapping("/getVolunteersByPage/{page}")
	@ResponseBody
	public String getVolunteersByPage(@PathVariable("page") int page) throws JsonProcessingException
	{
		Page<Volunteers> obj = volunteerRepo.findAll(PageRequest.of(page, 10));

		 String result = new ObjectMapper().writerWithView(JsonViewProfiles.Volunteers.class)
	                .writeValueAsString(obj);
		
		return result;
	}
	
}
