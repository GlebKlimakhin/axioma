package com.axioma.axiomatrainee.api;

import com.axioma.axiomatrainee.model.ReadingSpeedExercise;
import com.axioma.axiomatrainee.service.ReadingSpeedExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/reading")
public class ReadingSpeedExerciseController {

    private ReadingSpeedExerciseService service;

    @Autowired
    public void setService(ReadingSpeedExerciseService service) {
        this.service = service;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<ReadingSpeedExercise> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ReadingSpeedExercise findById(@PathVariable Long id) {
        return service.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(Long id) {
        service.deleteById(id);
    }
}
