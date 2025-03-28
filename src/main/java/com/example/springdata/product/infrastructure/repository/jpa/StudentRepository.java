package com.example.springdata.product.infrastructure.repository.jpa;

import com.example.springdata.product.infrastructure.repository.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> { }
