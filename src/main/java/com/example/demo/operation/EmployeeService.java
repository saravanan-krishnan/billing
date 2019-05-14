package com.example.demo.operation;

import com.example.demo.db.Employee;

public interface EmployeeService {
    Iterable<Employee> getEmployeeList();

    Employee createEmployee (Employee employee);

    Employee updateEmployee (Employee employee);

    String dropEmployee (Long id);

    Employee getEmployeeDetail (Long id);
}
