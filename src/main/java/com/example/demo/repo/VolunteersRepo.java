package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Volunteers;

@Repository
public interface VolunteersRepo extends JpaRepository<Volunteers, Integer> {

}

