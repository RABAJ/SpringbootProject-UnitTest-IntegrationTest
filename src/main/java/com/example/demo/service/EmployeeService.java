package com.example.demo.service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    private EmployeeRepo employeeRepository;

    @Override
    public EmployeeEntity getEmployeeByName(String name) {

        return employeeRepository.findByName(name);
    }
    @Override
    public List<EmployeeEntity> getAllEmployees() {

        return employeeRepository.findAll();
    }
}
