package com.talking.hand.talkinghand.controller;


import com.talking.hand.talkinghand.model.entities.Users;
import com.talking.hand.talkinghand.model.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/user")
public class UsersController {
    private UsersServices usersServices;

    @Autowired
    public UsersController(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    @GetMapping
    public List<Users> getUsers() {
        return usersServices.getUsers();
    }

    @PostMapping("add")
    public void registerNewUser(@RequestBody Users username) {
        usersServices.addNewUser(username);
    }

    @GetMapping(path = "{username}")
    public Optional<Users> getUsername(@PathVariable(name = "username") String username) {
        return usersServices.getUser(username);
    }

    @GetMapping(path = "login")
    public String checkLogin(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
        return usersServices.getCheck(username, password);

    }
}