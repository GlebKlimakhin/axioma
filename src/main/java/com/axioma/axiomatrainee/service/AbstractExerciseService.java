package com.axioma.axiomatrainee.service;

import com.axioma.axiomatrainee.model.AbstractExercise;

import java.util.List;
import java.util.Optional;

public interface AbstractExerciseService<T extends AbstractExercise> {

    List<T> findAll();

    Optional<T> findById(Long id);

    void deleteById(Long id);
}
