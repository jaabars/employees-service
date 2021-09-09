package kg.easy.employeesservice.services;

import kg.easy.employeesservice.models.Position;

import java.util.List;

public interface PositionService {
    Position save(Position position);

    List<Position> getAll();
}
