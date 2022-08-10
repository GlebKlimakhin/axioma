package com.axioma.axiomatrainee.repository;

import com.axioma.axiomatrainee.model.ReadingSpeedExercise;

import java.util.List;

public interface IReadingSpeedExerciseRepository extends IAbstractExerciseRepository<ReadingSpeedExercise> {
    @Override
    List<ReadingSpeedExercise> findAll();
}
