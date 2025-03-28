package com.example.springdata.product.infrastructure.controller.dto.output;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentOutputDto {
    int id;
    String name;
    String lastName;
}
