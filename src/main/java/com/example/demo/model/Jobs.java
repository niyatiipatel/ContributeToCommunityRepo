package com.example.demo.model;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.example.demo.controller.JsonViewProfiles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

@JavaBean
@Entity

@Table(name = "jobs")
public class Jobs {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name ="job_name")
	private String jobName;
	
	@Column(name ="job_desc")
	private String jobDesc;

	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	@JoinTable(name = "jobs_volunteers", joinColumns = @JoinColumn(name = "job_id"),
	inverseJoinColumns = @JoinColumn(name = "volunteer_id")
			)
	@JsonView(JsonViewProfiles.Jobs.class)
	private List<Volunteers> volunteers = new ArrayList<Volunteers>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobDesc() {
		return jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public List<Volunteers> getVolunteers() {
		return volunteers;
	}

	public void setVolunteers(List<Volunteers> volunteers) {
		this.volunteers = volunteers;
	}
	
	
	public Jobs(String jobName, String jobDesc)
	{
		this.jobDesc = jobDesc;
		this.jobName = jobName;
	}

	public Jobs() {
		// TODO Auto-generated constructor stub
	}
	
}
