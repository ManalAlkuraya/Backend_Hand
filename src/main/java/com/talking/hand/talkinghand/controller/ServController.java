package com.talking.hand.talkinghand.controller;

import com.talking.hand.talkinghand.model.entities.HearingImpaired;
import com.talking.hand.talkinghand.model.entities.Serv;
import com.talking.hand.talkinghand.model.services.ServServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/serv")
@CrossOrigin(origins = "http://localhost:3000")

public class ServController {
    private ServServices servServices;
    @Autowired
    public ServController(ServServices servServices){
        this.servServices = servServices;
    }

    @GetMapping
    public List<Serv> getServs(){
        return servServices.getServs();
    }

    @GetMapping(path="{servId}")
    public Optional<Serv> getServs(@PathVariable(name="servId") Integer servId){
        return servServices.getServ(servId);
    }

    @PostMapping("add")
    public void registerNewServ(@RequestBody Serv serv) {
        System.out.println("adding a service");
        servServices.addNewServ(serv);
    }

    @PutMapping(path= "update/{id}")
    public void updateServ(@RequestBody Serv serv){
        servServices.addNewServ(serv);
    }

    //work
    @DeleteMapping(path = "delete/{servId}")
    public void deleteServ(@PathVariable("servId") String servId) {
        int intservId = Integer.parseInt(servId);
        servServices.deleteServ(intservId);
    }
}
