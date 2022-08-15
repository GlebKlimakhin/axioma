package com.axioma.axiomatrainee.api;

import com.axioma.axiomatrainee.model.exercises.Exercise;
import com.axioma.axiomatrainee.model.exercises.ExerciseType;
import com.axioma.axiomatrainee.service.exercises.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/reading")
public class ReadingSpeedExerciseController {

    private ExerciseService service;

    public static final ExerciseType TYPE = ExerciseType.READING_SPEED;


    @Autowired
    public void setService(ExerciseService service) {
        this.service = service;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Exercise> findAll() {
        return service.findAllByType(TYPE);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Exercise findById(@PathVariable Long id) {
        return service.findById(id, TYPE).orElseThrow(EntityNotFoundException::new);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(Long id) {
        service.findAllByType(TYPE).forEach(e -> {
            if(e.getId().equals(id)) {
                service.deleteById(id);
            }
        });
        service.findAll();

    }
}
