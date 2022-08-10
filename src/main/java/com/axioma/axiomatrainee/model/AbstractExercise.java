package com.axioma.axiomatrainee.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@MappedSuperclass
@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class AbstractExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, insertable = false)
    Long id;

    @Column(name = "data")
    String data;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", insertable = false, updatable = false)
    ExerciseType type;
}