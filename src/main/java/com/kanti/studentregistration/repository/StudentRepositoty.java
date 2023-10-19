package com.kanti.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanti.studentregistration.entity.Student;

@Repository
public interface StudentRepositoty extends JpaRepository<Student, Integer>{
    
}
