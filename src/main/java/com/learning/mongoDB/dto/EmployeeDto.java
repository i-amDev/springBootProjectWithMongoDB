package com.learning.mongoDB.dto;

import com.learning.mongoDB.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String name;

    private String email;

    private int age;

    private Long salary;

    private Address address;
}
