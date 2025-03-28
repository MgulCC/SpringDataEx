package com.example.springdata.product.application.impl;

import com.example.springdata.product.application.StudentService;
import com.example.springdata.product.infrastructure.controller.dto.input.StudentInputDto;
import com.example.springdata.product.infrastructure.controller.dto.output.StudentOutputDto;
import com.example.springdata.product.infrastructure.repository.jpa.StudentRepository;
import com.example.springdata.product.infrastructure.repository.jpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentOutputDto addStudent(StudentInputDto student) {
        return studentRepository.save(new Student(student))

                .studentToStudentOutputDto();
    }

    @Override
    public StudentOutputDto getStudent(int id) {
        return studentRepository.findById(id).orElseThrow()
                .studentToStudentOutputDto();
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.findById(id).orElseThrow();
        studentRepository.deleteById(id);
    }

    @Override
    public List<StudentOutputDto> getAllStudent(int pageNumber, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        return studentRepository.findAll(pageRequest).getContent()
                .stream()
                .map(Student::studentToStudentOutputDto).toList();
    }

    @Override
    public StudentOutputDto upDateStudent(StudentInputDto student) {
        studentRepository.findById(student.getId()).orElseThrow();
        return studentRepository.save(new Student(student))
                .studentToStudentOutputDto();
    }
}
