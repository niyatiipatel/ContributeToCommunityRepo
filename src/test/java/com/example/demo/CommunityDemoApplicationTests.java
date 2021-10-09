package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Jobs;
import com.example.demo.model.Volunteers;
import com.example.demo.repo.JobsRepo;
import com.example.demo.repo.VolunteersRepo;

@SpringBootTest
class CommunityDemoApplicationTests {

	@Autowired
	VolunteersRepo volunteerRepo ;
	@Autowired
	JobsRepo jobsRepo;
	
	@Test
	public void testGetVolunteers()
	{
		List<Volunteers> listVolunteer = volunteerRepo.findAll();
		assertThat(listVolunteer).size().isGreaterThan(0);
	}
	
	@Test
	public void testGetVolunteersByJobId()
	{
		Jobs jobObj = jobsRepo.findById(1).get();
		assertThat(jobObj.getId()).isEqualTo(1);
	}

}
