package kg.easy.employeesservice.repository;

import kg.easy.employeesservice.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepo extends JpaRepository<Position,Long> {
}
