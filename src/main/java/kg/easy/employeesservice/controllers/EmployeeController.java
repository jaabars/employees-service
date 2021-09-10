package kg.easy.employeesservice.controllers;

import kg.easy.employeesservice.models.Employee;
import kg.easy.employeesservice.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {


    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }
    /**
     *Реализовать update метод
     *
     */
    @GetMapping("/get")
    public List<Employee> getEmployees(){
        return employeeService.getAll();
    }
}
