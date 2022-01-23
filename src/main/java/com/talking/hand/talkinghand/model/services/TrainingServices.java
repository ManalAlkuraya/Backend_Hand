package com.talking.hand.talkinghand.model.services;

import com.talking.hand.talkinghand.model.entities.Training;
import com.talking.hand.talkinghand.model.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingServices {
    private TrainingRepository trainingRepository;
    @Autowired
    public TrainingServices(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public List<Training> getTrainings()
    {
        return trainingRepository.findAll();
    }

    public Optional<Training> getTraining(Integer trainingId) {
        return trainingRepository.findById(trainingId);
    }


    public void addNewTraining(Training training){
        trainingRepository.save(training);
    }

    public void deleteTraining(Integer trainingId) {
        trainingRepository.deleteById(trainingId);
        //boolean exist = studentRepository.existsById(studentId);
        // put a condition on 'exist'. if exist then delete
    }
}
