package com.axioma.axiomatrainee.service;

import com.axioma.axiomatrainee.model.ReadingSpeedExercise;
import com.axioma.axiomatrainee.repository.IReadingSpeedExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReadingSpeedExerciseService implements AbstractExerciseService<ReadingSpeedExercise> {

    private IReadingSpeedExerciseRepository repository;

    @Autowired
    public void setRepository(IReadingSpeedExerciseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ReadingSpeedExercise> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<ReadingSpeedExercise> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
