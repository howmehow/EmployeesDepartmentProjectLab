package com.example.codeclan.EmployeeLab.repositories;

import com.example.codeclan.EmployeeLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}