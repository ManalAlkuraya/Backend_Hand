package com.talking.hand.talkinghand.model.services;

import com.talking.hand.talkinghand.model.entities.HearingImpaired;
import com.talking.hand.talkinghand.model.entities.Serv;
import com.talking.hand.talkinghand.model.repository.HearingImpairedRepository;
import com.talking.hand.talkinghand.model.repository.ServRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServServices {
    private ServRepository servRepository;
    @Autowired
    public ServServices(ServRepository servRepository) {
        this.servRepository = servRepository;
    }

    public List<Serv> getServs()
    {
        return servRepository.findAll();
    }

    public Optional<Serv> getServ(Integer servId) {
        return servRepository.findById(servId);
    }


    public void addNewServ(Serv serv){
        servRepository.save(serv);
    }

    public void deleteServ(Integer servId) {
        servRepository.deleteById(servId);
        //boolean exist = studentRepository.existsById(studentId);
        // put a condition on 'exist'. if exist then delete
    }
}
