package com.teco.loginsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teco.loginsystem.model.Student;

//TECOQUINHO
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
