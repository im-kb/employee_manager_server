package com.example.employee_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee_manager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
