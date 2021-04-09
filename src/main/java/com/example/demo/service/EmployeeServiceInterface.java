package com.example.demo.service;

import com.example.demo.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeServiceInterface {
    public EmployeeEntity getEmployeeByName(String name);
    public List<EmployeeEntity> getAllEmployees();
}
