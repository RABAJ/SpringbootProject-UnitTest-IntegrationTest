package com.example.demo.repository;


import com.example.demo.entity.EmployeeEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

    public EmployeeEntity findByName(String name);
    public List<EmployeeEntity> findAll();

}
