package com.ust.EmployeeInfo.controller;

import com.ust.EmployeeInfo.model.Employee;
import com.ust.EmployeeInfo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("/addemployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return empService.addEmployee(employee);
    }

    @GetMapping("/listemployees")
    public List<Employee> listEmployees() {
        return empService.listEmployees();
    }

    @GetMapping("/getemp/{id}")
    public Employee getEmp(@PathVariable int id){
        return empService.getEmp(id);
    }

    @DeleteMapping("/delemp/{id}")
    public String deleteEmployee(@PathVariable int id){
        return empService.deleteEmployee(id);
    }

    @PutMapping("/updateemp/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return empService.updateEmployee(id, employee);
    }
}