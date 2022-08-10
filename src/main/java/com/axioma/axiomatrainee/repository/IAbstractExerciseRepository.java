package com.axioma.axiomatrainee.repository;

import com.axioma.axiomatrainee.model.AbstractExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IAbstractExerciseRepository<T extends AbstractExercise> extends JpaRepository<T, Long> {

//    List<T> findAllByType(ExerciseType type);
}
