package com.talking.hand.talkinghand.model.services;

import com.talking.hand.talkinghand.model.entities.Employee;
import com.talking.hand.talkinghand.model.entities.Training;
import com.talking.hand.talkinghand.model.repository.EmployeeRepository;
import com.talking.hand.talkinghand.model.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServices {
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServices(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees()
    {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployee(Integer employeeId) {
        return employeeRepository.findById(employeeId);
    }


    public void addNewEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer employeeId) {
        employeeRepository.deleteById(employeeId);
        //boolean exist = studentRepository.existsById(studentId);
        // put a condition on 'exist'. if exist then delete
    }
}
