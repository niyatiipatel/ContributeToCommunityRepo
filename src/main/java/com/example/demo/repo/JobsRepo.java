package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Jobs;

public interface JobsRepo extends JpaRepository<Jobs, Integer>{


}
