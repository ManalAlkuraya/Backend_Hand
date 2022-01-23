package com.talking.hand.talkinghand.model.services;

import com.talking.hand.talkinghand.model.entities.Users;
import com.talking.hand.talkinghand.model.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {
    private UsersRepository usersRepository;

    @Autowired
    public UsersServices(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();

    }

    public Optional<Users> getUser(String username ) {
        return usersRepository.findById(username );
    }
    public String getCheck(String username ,String password) {
        if( usersRepository.existsById(username)  ) {

            String pass = usersRepository.findByUsername(username);
            if (pass.equals(password)) {
                String role = usersRepository.findRole(username);
                return "authenticated"+ role;
            } else {
                return " invalid password";
            }
        }
        return "user not found";
    }

    public void addNewUser(Users username) {
        usersRepository.save(username);
    }
}
