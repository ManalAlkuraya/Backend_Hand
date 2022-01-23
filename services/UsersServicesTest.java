package com.talking.hand.talkinghand.services;

import com.talking.hand.talkinghand.model.entities.Users;
import com.talking.hand.talkinghand.model.repository.UsersRepository;
import com.talking.hand.talkinghand.model.services.UsersServices;
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

class UsersServicesTest {
    @Mock
    UsersRepository usersRepository;
    @InjectMocks
    UsersServices usersServices;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUsers() {
        List<Users> result = usersServices.getUsers();
        Assertions.assertEquals(Arrays.<Users>asList(new Users("username", "password", "role")), result);
    }

    @Test
    void testGetUser() {
        Optional<Users> result = usersServices.getUser("username");
        Assertions.assertEquals(Optional.empty(), result);
    }

    @Test
    void testGetCheck() {
        when(usersRepository.findByUsername(anyString())).thenReturn("findByUsernameResponse");
        when(usersRepository.findRole(anyString())).thenReturn("findRoleResponse");

        String result = usersServices.getCheck("username", "password");
        Assertions.assertEquals("user not found", result);
    }

    @Test
    void testAddNewUser() {
        usersServices.addNewUser(new Users("username", "password", "role"));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme