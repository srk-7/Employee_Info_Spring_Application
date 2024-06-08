package com.ust.EmployeeInfo.service;

import com.ust.EmployeeInfo.model.Employee;
import com.ust.EmployeeInfo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpService {
    @Autowired
    private EmpRepo repo;

    public List<Employee> listEmployees() {
        return repo.findAll();
    }

    public Employee getEmp(int id) {
        return repo.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public String deleteEmployee(int empid) {
        repo.deleteById(empid);
        return "Employee deleted with id " + empid;
    }

    public Employee updateEmployee(int empid, Employee employeeDetails) {
        Employee employee = repo.findById(empid).orElse(null);
        if (employee != null) {
            employee.setName(employeeDetails.getName());
            employee.setSal(employeeDetails.getSal());
            employee.setGrade(employeeDetails.getGrade());
            return repo.save(employee);
        }
        return null;
    }

}