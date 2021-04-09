package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/employee")
    public EmployeeDto getEmployee() {
        EmployeeDto employeeDto = new EmployeeDto();
        EmployeeEntity alex1=employeeService.getEmployeeByName("ParasAgarwal");
        employeeDto = employeeMapper.toEmployeeDto(alex1);

        return employeeDto;
    }
}
