package com.example.demo.model;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.example.demo.controller.JsonViewProfiles;
import com.fasterxml.jackson.annotation.JsonView;

@JavaBean
@Entity

@Table(name = "volunteers")
public class Volunteers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;

	@JsonView(JsonViewProfiles.Volunteers.class)
	@ManyToMany(mappedBy = "volunteers")
    private List<Jobs> jobs;
 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Jobs> getJobs() {
		return jobs;
	}

	public void setJobs(List<Jobs> jobs) {
		this.jobs = jobs;
	}

}
