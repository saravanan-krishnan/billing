package com.example.demo.operation;

import com.example.demo.db.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Iterable<Employee> getEmployeeList() {
        return null;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public String dropEmployee(Long id) {
        return null;
    }

    @Override
    public Employee getEmployeeDetail(Long id) {
        return null;
    }
}
