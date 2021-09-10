package kg.easy.employeesservice.repository;

import kg.easy.employeesservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo  extends JpaRepository<Employee,Long> {
}