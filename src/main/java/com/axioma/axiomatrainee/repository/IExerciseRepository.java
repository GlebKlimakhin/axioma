package com.axioma.axiomatrainee.repository;

import com.axioma.axiomatrainee.model.exercises.Exercise;
import com.axioma.axiomatrainee.model.exercises.ExerciseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IExerciseRepository extends JpaRepository<Exercise, Long> {

    List<Exercise> findAllByExerciseTypeEquals(ExerciseType exerciseType);

    Optional<Exercise> findByIdAndExerciseTypeEquals(Long id, ExerciseType exerciseType);
}
