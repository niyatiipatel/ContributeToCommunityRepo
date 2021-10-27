package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.example.demo.model.Jobs;
import com.example.demo.model.Volunteers;
import com.example.demo.repo.JobsRepo;
import com.example.demo.repo.VolunteersRepo;

@Component
public class CommunityService {

	@Autowired
	JobsRepo jobsRepo;
	
	@Autowired
	VolunteersRepo volunteerRepo;
	
	public Jobs getVolunteersByJobId(int id) {
		
		Jobs jobObj = jobsRepo.findById(id).orElse(new Jobs());
		//jobObj = null;// testing assertThatNullPointerException assertion when obj is null
		//jobObj.setJobName(null);//tried changing first name here since it was included in test case, the test case fails here
		return jobObj;
	}

	public Page<Volunteers> getVolunteersByPage(int page) {
		
		Page<Volunteers> obj = volunteerRepo.findAll(PageRequest.of(page, 10));
		//obj = null;//// testing assertThatNullPointerException assertion when obj is null
		
		return obj;

	}

}
