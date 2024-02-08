package com.example.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagementsystem.entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {

}