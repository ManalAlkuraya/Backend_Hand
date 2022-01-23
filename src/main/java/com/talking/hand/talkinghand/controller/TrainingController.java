package com.talking.hand.talkinghand.controller;


import com.talking.hand.talkinghand.model.entities.HearingImpaired;
import com.talking.hand.talkinghand.model.entities.Training;
import com.talking.hand.talkinghand.model.services.TrainingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "Training")

public class TrainingController {
    private TrainingServices trainingServices;

    @Autowired
    public TrainingController(TrainingServices trainingServices) {
        this.trainingServices = trainingServices;
    }

    //@GetMapping("api/student")
    @GetMapping
    public List<Training> getTrainings() {
        return trainingServices.getTrainings();
    }

    @GetMapping(path = "{trainingId}")
    public Optional<Training> getTraining(@PathVariable(name = "trainingId") Integer trainingId) {
        return trainingServices.getTraining(trainingId);

    }

    //@PostMapping("/api/student/add")
    @PostMapping("add")
    public void registerNewTraining(@RequestBody Training training) {
        trainingServices.addNewTraining(training);
    }

    @PutMapping(path="update/{id}")
    public void updateTraining(@RequestBody Training training){
        trainingServices.addNewTraining(training);
    }
//work
    @DeleteMapping(path = "delete/{trainingId}")
    public void deleteTraining(@PathVariable("trainingId") Integer trainingId) {
        trainingServices.deleteTraining(trainingId);
    }
}