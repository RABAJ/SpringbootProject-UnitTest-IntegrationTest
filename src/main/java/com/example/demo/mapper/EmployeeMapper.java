package com.example.demo.mapper;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.EmployeeEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeMapper {

    public EmployeeEntity fromEmployeeDto(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity= EmployeeEntity.builder()
                .id(employeeDto.getId())
                .name(employeeDto.getName())
                .build();



        return employeeEntity;
    }



    public EmployeeDto toEmployeeDto(EmployeeEntity employeeEntity) {
        EmployeeDto employeeDto=EmployeeDto.builder()
                .id(employeeEntity.getId())
                .name(employeeEntity.getName())
                .build();

        return employeeDto;
    }

}
