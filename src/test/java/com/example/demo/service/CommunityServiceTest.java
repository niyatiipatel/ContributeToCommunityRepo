package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.example.demo.model.Volunteers;
import com.example.demo.model.Jobs;
import com.example.demo.repo.JobsRepo;
import com.example.demo.repo.VolunteersRepo;

class CommunityServiceTest {

	@InjectMocks
	CommunityService commService;//Class in test, used to inject the Mocks(in this case job and vol repo)
	
	@Mock
	JobsRepo jobsRepo; // to use mock of this repo to get Job details
	
	@Mock
	VolunteersRepo volunteersRepo; // to use mock of this repo to get volunteers details

	@Mock
	Page<Volunteers> page;
	
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);//To initialize instance followed by @Mock
	}

	@Test
	void testGetVolunteersByJobId() {
		
		Optional<Jobs> optionalJob = Optional.of(new Jobs());
		Jobs jobObj = optionalJob.get();
		jobObj.setId(1);
		jobObj.setJobDesc("Job test");
		jobObj.setJobName("Job test name");
		Volunteers volObj = new Volunteers();
		volObj.setId(1);
		volObj.setFirstName("First Name");
		volObj.setLastName("Last Name");
		List<Volunteers> list = new ArrayList<Volunteers>();
		list.add(volObj);
		jobObj.setVolunteers(list);
		
		when(jobsRepo.findById(anyInt())).thenReturn(optionalJob);
		
		Jobs jobObjNew = commService.getVolunteersByJobId(1);
		assertNotNull(jobObjNew, () -> "Job Object is null");
		assertEquals(jobObj, jobObjNew);
		assertEquals("Job test name",jobObjNew.getJobName());
		assertTrue(jobObjNew.getVolunteers().size() >0);
		assertThatNullPointerException().as(()-> "Job Object is null");
		
	}

	@Test
	void testGetVolunteersByPage() {
		
		List<Volunteers> arrList = new ArrayList<Volunteers>();
		Volunteers volObj = new Volunteers();
		volObj.setFirstName("First Name");
		volObj.setLastName("Last Name");
		
		Jobs jobObj = new Jobs();
		jobObj.setId(1);
		jobObj.setJobDesc("Job test");
		jobObj.setJobName("Job test name");
		List<Jobs> arrJobList = new ArrayList<Jobs>();
		arrJobList.add(jobObj);
		volObj.setJobs(arrJobList);
		arrList.add(volObj);
		
		Pageable pageable= PageRequest.of(0,10);
		Page<Volunteers> pageResult = new PageImpl<>(arrList,pageable,10);

		when(volunteersRepo.findAll(pageable)).thenReturn((pageResult));
		
		Page<Volunteers> pageResultNew = commService.getVolunteersByPage(0);
		assertNotNull(pageResultNew);
		assertEquals(pageResult, pageResultNew);
		assertEquals(pageResult.getNumberOfElements(),pageResultNew.getNumberOfElements());
		assertEquals(pageResult.getSize(), pageResultNew.getSize());
		
	}

}
