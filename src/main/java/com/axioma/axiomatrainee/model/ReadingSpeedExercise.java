package com.axioma.axiomatrainee.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reading_speed_exercises")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReadingSpeedExercise extends AbstractExercise {
    int score;
}
