package com.axioma.axiomatrainee.api;

import com.axioma.axiomatrainee.model.exercises.DoneExercise;
import com.axioma.axiomatrainee.model.exercises.ExerciseType;
import com.axioma.axiomatrainee.service.exercises.DoneExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/done")
public class DoneExerciseController {

    private DoneExerciseService doneExerciseService;

    @Autowired
    public void setDoneExerciseService(DoneExerciseService doneExerciseService) {
        this.doneExerciseService = doneExerciseService;
    }

    @GetMapping("/userId={userId}&exerciseType={exerciseType}")
    @ResponseStatus(HttpStatus.OK)
    public List<DoneExercise> findAllByUserIdAndExerciseType(@PathVariable Long userId,
                                                             @PathVariable ExerciseType exerciseType) {
        return doneExerciseService.findAllByUserIdAndType(userId, exerciseType);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public DoneExercise save(@RequestBody DoneExercise doneExercise) {
        return doneExerciseService.save(doneExercise);
    }
}
