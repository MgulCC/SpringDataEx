package com.example.springdata.product.application;

import com.example.springdata.product.infrastructure.controller.dto.input.StudentInputDto;
import com.example.springdata.product.infrastructure.controller.dto.output.StudentOutputDto;

public interface StudentService {

    StudentOutputDto addStudent(StudentInputDto student);

    StudentOutputDto getStudent(int id);

    void deleteStudentById(int id);

    Iterable<StudentOutputDto> getAllStudent(int pageNumber, int pageSize);

    StudentOutputDto upDateStudent(StudentInputDto student);
}
