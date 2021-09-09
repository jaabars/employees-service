package kg.easy.employeesservice.services.impl;

import kg.easy.employeesservice.models.Position;
import kg.easy.employeesservice.repository.PositionRepo;
import kg.easy.employeesservice.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    private PositionRepo positionRepo;

    @Autowired
    public PositionServiceImpl(PositionRepo positionRepo) {
        this.positionRepo = positionRepo;
    }

    @Override
    public Position save(Position position) {
        return positionRepo.save(position);
    }

    @Override
    public List<Position> getAll() {
        return positionRepo.findAll();
    }
}
