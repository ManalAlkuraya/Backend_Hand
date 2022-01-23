package com.talking.hand.talkinghand.services;

import com.talking.hand.talkinghand.model.entities.Employee;
import com.talking.hand.talkinghand.model.repository.EmployeeRepository;
import com.talking.hand.talkinghand.model.services.EmployeeServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class EmployeeServicesTest {
    @Mock
    EmployeeRepository employeeRepository;
    @InjectMocks
    EmployeeServices employeeServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetEmployees() {
        List<Employee> result = employeeServices.getEmployees();
        Assertions.assertEquals(Arrays.<Employee>asList(new Employee(0, "name", "phonenumber", "email")), result);
    }

    @Test
    void testGetEmployee() {
        Optional<Employee> result = employeeServices.getEmployee(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewEmployee() {
        employeeServices.addNewEmployee(new Employee(0, "name", "phonenumber", "email"));
    }

    @Test
    void testDeleteEmployee() {
        employeeServices.deleteEmployee(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme