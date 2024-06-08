package com.ust.EmployeeInfo.repository;

import com.ust.EmployeeInfo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
}