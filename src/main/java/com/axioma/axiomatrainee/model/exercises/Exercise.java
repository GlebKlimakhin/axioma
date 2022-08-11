package com.axioma.axiomatrainee.model.exercises;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@Entity
@Table(name = "exercises")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "data")
    String data;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    ExerciseType exerciseType;

}