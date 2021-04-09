package com.example.demo;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
    @Mock
    private EmployeeRepo employeeRepo;

    @InjectMocks
    private EmployeeService employeeService;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFindByName(){
        EmployeeEntity employeeEntity = EmployeeEntity.builder()
                .id(Long.valueOf(2))
                .name("ParasAgarwal")
                .build();



        Mockito.when(employeeRepo.findByName("ParasAgarwal")).thenReturn(employeeEntity);

        EmployeeEntity employeeEntity1 = employeeService.getEmployeeByName("ParasAgarwal");

        assertEquals(employeeEntity,employeeEntity1);
    }
}
