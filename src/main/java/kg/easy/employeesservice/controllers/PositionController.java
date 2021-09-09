package kg.easy.employeesservice.controllers;

import kg.easy.employeesservice.models.Position;
import kg.easy.employeesservice.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/position")
public class PositionController {


    private PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }


    @PostMapping("/save")
    public Position savePosition(@RequestBody Position position){
        return positionService.save(position);
    }
    @GetMapping("/getAll")
    public List<Position> getAllPositions(){
        return positionService.getAll();
    }

    @PutMapping("/update")
    public Position updatePosition(@RequestBody Position position){
        return positionService.save(position);
    }
}
