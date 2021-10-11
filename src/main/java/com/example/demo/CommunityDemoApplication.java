package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Jobs;
import com.example.demo.model.Volunteers;
import com.example.demo.repo.JobsRepo;
import com.example.demo.repo.VolunteersRepo;

@SpringBootApplication
public class CommunityDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CommunityDemoApplication.class, args);
	}

	@Autowired
	JobsRepo jobsRepo;
	
	@Autowired
	VolunteersRepo volunteersRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		jobsRepo.deleteAllInBatch();
		volunteersRepo.deleteAllInBatch();
		
		//Create a Job
		Jobs jobObj1 = new Jobs("Front Desk", "Manage the front desk , keep track of signed in guest and print entry badges.");
		Jobs jobObj2 = new Jobs("Stage Organizer", "Organize and arrange the props on the perofrmance stage during the event.");
		Jobs jobObj3 = new Jobs("Guest Coordinator", "Provide information to the guests about events, locations & details");
		Jobs jobObj4 = new Jobs("Food Services", "Handle food logistics, preperation & serving");
		Jobs jobObj5 = new Jobs("Stationary Services","Manage stationary supplies.");
		Jobs jobObj6 = new Jobs("Security Personnel","Manage security outside of each event space by controlling entry exits.");
		Jobs jobObj7 = new Jobs("General Supervisor","Act as a supervisor to the team of volunteers like. We prefer to have past history working for us in order to qualify as a supervisor.");
		
		
		//Create a volunteer
		Volunteers volunteerObj1 = new Volunteers("Barry", "Towne");
		Volunteers volunteerObj2 = new Volunteers("Ethyl", "Donnelly");
		Volunteers volunteerObj3 = new Volunteers("Felipe", "Breitenberg");
		Volunteers volunteerObj4 = new Volunteers("Fred", "Hettinger");
		Volunteers volunteerObj5 = new Volunteers("Freeda", "Koelpin");
		Volunteers volunteerObj6 = new Volunteers("Guy", "Considine");
		Volunteers volunteerObj7 = new Volunteers("Gillian", "Gerhold");
		Volunteers volunteerObj8 = new Volunteers("Gloria", "Williamson");
		Volunteers volunteerObj9 = new Volunteers("Gordon", "Kirlin");
		Volunteers volunteerObj10 = new Volunteers("Isabell", "Prosacco");
		Volunteers volunteerObj11 = new Volunteers("Jacky", "Renner");
		Volunteers volunteerObj12 = new Volunteers("Kaitlyn", "Tillman");
		Volunteers volunteerObj13= new Volunteers("Laverna", "DAmore");
		Volunteers volunteerObj14= new Volunteers("Lonnie", "Kreiger");
		Volunteers volunteerObj15= new Volunteers("Maeve", "Hahn");
		Volunteers volunteerObj16= new Volunteers("Marcia", "Corkery");
		Volunteers volunteerObj17= new Volunteers("Melyssa", "Boehm");
		Volunteers volunteerObj18= new Volunteers("Muriel", "Metz");
		Volunteers volunteerObj19= new Volunteers("Nat", "Conn");
		Volunteers volunteerObj20= new Volunteers("Orin", "Bahringer");
		Volunteers volunteerObj21= new Volunteers("Pascale", "Hayes");
		Volunteers volunteerObj22= new Volunteers("Phoebe", "Collier");
		Volunteers volunteerObj23= new Volunteers("Rowena", "Walsh");
		Volunteers volunteerObj24= new Volunteers("Sabryna", "Schowalter");
		Volunteers volunteerObj25= new Volunteers("Sahil", "Pacocha");
		Volunteers volunteerObj26= new Volunteers("Sanford", "Toy");
		Volunteers volunteerObj27= new Volunteers("Viola", "Wisozk");
		
		//Add Volunteer references in Jobs 1
		jobObj1.getVolunteers().add(volunteerObj6);
		jobObj1.getVolunteers().add(volunteerObj10);
		jobObj1.getVolunteers().add(volunteerObj12);
		jobObj1.getVolunteers().add(volunteerObj13);
		jobObj1.getVolunteers().add(volunteerObj16);
		jobObj1.getVolunteers().add(volunteerObj19);
		jobObj1.getVolunteers().add(volunteerObj20);
		jobObj1.getVolunteers().add(volunteerObj23);
		jobObj1.getVolunteers().add(volunteerObj24);
		
		//Add Job references in Volunteer
		volunteerObj6.getJobs().add(jobObj1);
		volunteerObj10.getJobs().add(jobObj1);
		volunteerObj12.getJobs().add(jobObj1);
		volunteerObj13.getJobs().add(jobObj1);
		volunteerObj16.getJobs().add(jobObj1);
		volunteerObj19.getJobs().add(jobObj1);
		volunteerObj20.getJobs().add(jobObj1);
		volunteerObj23.getJobs().add(jobObj1);
		volunteerObj24.getJobs().add(jobObj1);
		
		//Job2
		
		jobObj2.getVolunteers().add(volunteerObj1);
		jobObj2.getVolunteers().add(volunteerObj7);
		jobObj2.getVolunteers().add(volunteerObj15);
		jobObj2.getVolunteers().add(volunteerObj17);
		jobObj2.getVolunteers().add(volunteerObj18);
		jobObj2.getVolunteers().add(volunteerObj22);
		jobObj2.getVolunteers().add(volunteerObj25);
		
		volunteerObj1.getJobs().add(jobObj2);
		volunteerObj7.getJobs().add(jobObj2);
		volunteerObj15.getJobs().add(jobObj2);
		volunteerObj17.getJobs().add(jobObj2);
		volunteerObj18.getJobs().add(jobObj2);
		volunteerObj22.getJobs().add(jobObj2);
		volunteerObj25.getJobs().add(jobObj2);
		
		//Job3
		jobObj3.getVolunteers().add(volunteerObj2);
		jobObj3.getVolunteers().add(volunteerObj5);
		jobObj3.getVolunteers().add(volunteerObj8);
		jobObj3.getVolunteers().add(volunteerObj9);
		jobObj3.getVolunteers().add(volunteerObj10);
		jobObj3.getVolunteers().add(volunteerObj11);
		jobObj3.getVolunteers().add(volunteerObj13);
		jobObj3.getVolunteers().add(volunteerObj14);
		jobObj3.getVolunteers().add(volunteerObj18);
		jobObj3.getVolunteers().add(volunteerObj19);
		jobObj3.getVolunteers().add(volunteerObj20);
		jobObj3.getVolunteers().add(volunteerObj21);
		jobObj3.getVolunteers().add(volunteerObj22);
		jobObj3.getVolunteers().add(volunteerObj24);
		jobObj3.getVolunteers().add(volunteerObj27);
		
		volunteerObj2.getJobs().add(jobObj3);
		volunteerObj5.getJobs().add(jobObj3);
		volunteerObj8.getJobs().add(jobObj3);
		volunteerObj9.getJobs().add(jobObj3);
		volunteerObj10.getJobs().add(jobObj3);
		volunteerObj11.getJobs().add(jobObj3);
		volunteerObj13.getJobs().add(jobObj3);
		volunteerObj14.getJobs().add(jobObj3);
		volunteerObj18.getJobs().add(jobObj3);
		volunteerObj19.getJobs().add(jobObj3);
		volunteerObj20.getJobs().add(jobObj3);
		volunteerObj21.getJobs().add(jobObj3);
		volunteerObj22.getJobs().add(jobObj3);
		volunteerObj24.getJobs().add(jobObj3);
		volunteerObj27.getJobs().add(jobObj3);
		
		//Job 4
		jobObj4.getVolunteers().add(volunteerObj2);
		jobObj4.getVolunteers().add(volunteerObj3);
		jobObj4.getVolunteers().add(volunteerObj4);
		jobObj4.getVolunteers().add(volunteerObj6);
		jobObj4.getVolunteers().add(volunteerObj11);
		jobObj4.getVolunteers().add(volunteerObj16);
		jobObj4.getVolunteers().add(volunteerObj20);
		jobObj4.getVolunteers().add(volunteerObj21);
		jobObj4.getVolunteers().add(volunteerObj26);
		
		volunteerObj2.getJobs().add(jobObj4);
		volunteerObj3.getJobs().add(jobObj4);
		volunteerObj4.getJobs().add(jobObj4);
		volunteerObj6.getJobs().add(jobObj4);
		volunteerObj11.getJobs().add(jobObj4);
		volunteerObj16.getJobs().add(jobObj4);
		volunteerObj20.getJobs().add(jobObj4);
		volunteerObj21.getJobs().add(jobObj4);
		volunteerObj26.getJobs().add(jobObj4);
		
		//Job 5
		jobObj5.getVolunteers().add(volunteerObj3);
		jobObj5.getVolunteers().add(volunteerObj5);
		jobObj5.getVolunteers().add(volunteerObj14);
		jobObj5.getVolunteers().add(volunteerObj24);
		
		volunteerObj3.getJobs().add(jobObj5);
		volunteerObj5.getJobs().add(jobObj5);
		volunteerObj14.getJobs().add(jobObj5);
		volunteerObj24.getJobs().add(jobObj5);
		
		//job 6
		jobObj6.getVolunteers().add(volunteerObj5);
		jobObj6.getVolunteers().add(volunteerObj9);
		jobObj6.getVolunteers().add(volunteerObj11);
		jobObj6.getVolunteers().add(volunteerObj17);
		jobObj6.getVolunteers().add(volunteerObj21);
		jobObj6.getVolunteers().add(volunteerObj22);
		jobObj6.getVolunteers().add(volunteerObj25);
		
		volunteerObj5.getJobs().add(jobObj6);
		volunteerObj9.getJobs().add(jobObj6);
		volunteerObj11.getJobs().add(jobObj6);
		volunteerObj17.getJobs().add(jobObj6);
		volunteerObj21.getJobs().add(jobObj6);
		volunteerObj22.getJobs().add(jobObj6);
		volunteerObj25.getJobs().add(jobObj6);
		
		//Job 7
		jobObj7.getVolunteers().add(volunteerObj1);
		jobObj7.getVolunteers().add(volunteerObj3);
		jobObj7.getVolunteers().add(volunteerObj4);
		jobObj7.getVolunteers().add(volunteerObj7);
		jobObj7.getVolunteers().add(volunteerObj9);
		jobObj7.getVolunteers().add(volunteerObj10);
		jobObj7.getVolunteers().add(volunteerObj12);
		jobObj7.getVolunteers().add(volunteerObj16);
		jobObj7.getVolunteers().add(volunteerObj17);
		jobObj7.getVolunteers().add(volunteerObj23);
		jobObj7.getVolunteers().add(volunteerObj25);
		jobObj7.getVolunteers().add(volunteerObj26);
		jobObj7.getVolunteers().add(volunteerObj27);
		
		volunteerObj1.getJobs().add(jobObj7);
		volunteerObj3.getJobs().add(jobObj7);
		volunteerObj4.getJobs().add(jobObj7);
		volunteerObj7.getJobs().add(jobObj7);
		volunteerObj9.getJobs().add(jobObj7);
		volunteerObj10.getJobs().add(jobObj7);
		volunteerObj12.getJobs().add(jobObj7);
		volunteerObj16.getJobs().add(jobObj7);
		volunteerObj17.getJobs().add(jobObj7);
		volunteerObj23.getJobs().add(jobObj7);
		volunteerObj25.getJobs().add(jobObj7);
		volunteerObj26.getJobs().add(jobObj7);
		volunteerObj27.getJobs().add(jobObj7);
		
		List<Jobs> listObj = new ArrayList<Jobs>();
		listObj.add(jobObj1);
		listObj.add(jobObj2);
		listObj.add(jobObj3);
		listObj.add(jobObj4);
		listObj.add(jobObj5);
		listObj.add(jobObj6);
		listObj.add(jobObj7);
		jobsRepo.saveAll(listObj);
		
		
		
	}
	
	

}
