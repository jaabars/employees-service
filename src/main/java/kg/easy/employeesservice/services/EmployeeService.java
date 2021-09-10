package kg.easy.employeesservice.services;

import kg.easy.employeesservice.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAll();
}
