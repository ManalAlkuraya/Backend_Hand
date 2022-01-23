package com.talking.hand.talkinghand.controller;

import com.talking.hand.talkinghand.model.entities.Employee;
import com.talking.hand.talkinghand.model.entities.Training;
import com.talking.hand.talkinghand.model.services.EmployeeServices;
import com.talking.hand.talkinghand.model.services.TrainingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path="Employee")
public class EmployeeController {
    private EmployeeServices employeeServices;

    @Autowired
    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    //@GetMapping("api/student")
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeServices.getEmployees();
    }

    @GetMapping(path = "{employeeId}")
    public Optional<Employee> getEmployee(@PathVariable(name = "employeeId") Integer employeeId) {
        return employeeServices.getEmployee(employeeId);

    }

    //@PostMapping("/api/student/add")
    @PostMapping("add")
    public void registerNewEmployee(@RequestBody Employee employee) {
        employeeServices.addNewEmployee(employee);
    }

    @PutMapping(path="update/{id}")
    public void updateEmployee(@RequestBody Employee employee){
        employeeServices.addNewEmployee(employee);
    }
    //work
    @DeleteMapping(path = "delete/{EmployeeId}")
    public void deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
        employeeServices.deleteEmployee(employeeId);
    }
}
