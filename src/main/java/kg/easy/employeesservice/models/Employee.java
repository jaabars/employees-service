package kg.easy.employeesservice.models;

import kg.easy.employeesservice.models.enums.EmployeeStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    @Enumerated(EnumType.STRING)
    EmployeeStatus employeeStatus;

    @ManyToOne
    @JoinColumn(name = "position_id")
    Position position;
}
