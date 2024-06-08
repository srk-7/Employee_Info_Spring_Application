package com.ust.EmployeeInfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue

    private int empid;
    private String name;
    private String sal;
    private Character grade;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Employee{" +
                "id=" + empid +
                ", name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", grade=" + grade +
                '}';
    }

    public int hashCode() {
        return Objects.hash(empid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return empid == that.empid && Objects.equals(name, that.name) && Objects.equals(sal, that.sal) && Objects.equals(grade, that.grade);
    }
}

