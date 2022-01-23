package com.talking.hand.talkinghand.services;

import com.talking.hand.talkinghand.model.entities.Training;
import com.talking.hand.talkinghand.model.repository.TrainingRepository;
import com.talking.hand.talkinghand.model.services.TrainingServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class TrainingServicesTest {
    @Mock
    TrainingRepository trainingRepository;
    @InjectMocks
    TrainingServices trainingServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetTrainings() {
        List<Training> result = trainingServices.getTrainings();
        Assertions.assertEquals(Arrays.<Training>asList(new Training(0, "trainingname", "trainingdescription", "traininglocation", "tweek", "tday", "ttime", "t_text", "links")), result);
    }

    @Test
    void testGetTraining() {
        Optional<Training> result = trainingServices.getTraining(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewTraining() {
        trainingServices.addNewTraining(new Training(0, "trainingname", "trainingdescription", "traininglocation", "tweek", "tday", "ttime", "t_text", "links"));
    }

    @Test
    void testDeleteTraining() {
        trainingServices.deleteTraining(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme