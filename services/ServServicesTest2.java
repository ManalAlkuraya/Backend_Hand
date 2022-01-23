package com.talking.hand.talkinghand.services;

import com.talking.hand.talkinghand.model.entities.Serv;
import com.talking.hand.talkinghand.model.repository.ServRepository;
import com.talking.hand.talkinghand.model.services.ServServices;
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

class ServServicesTest2 {
    @Mock
    ServRepository servRepository;
    @InjectMocks
    ServServices servServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetServs() {
        List<Serv> result = servServices.getServs();
        Assertions.assertEquals(Arrays.<Serv>asList(new Serv(0, 0, null, null, null, null, null, null, null, null, null, null, null, null)), result);
    }

    @Test
    void testGetServ() {
        Optional<Serv> result = servServices.getServ(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewServ() {
        servServices.addNewServ(new Serv(0, 0, null, null, null, null, null, null, null, null, null, null, null, null));
    }

    @Test
    void testDeleteServ() {
        servServices.deleteServ(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme