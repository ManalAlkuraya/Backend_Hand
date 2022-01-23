package com.talking.hand.talkinghand.model.repository;

import com.talking.hand.talkinghand.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
