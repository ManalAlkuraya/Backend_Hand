package com.talking.hand.talkinghand.controller;

import com.talking.hand.talkinghand.model.entities.HearingImpaired;
import com.talking.hand.talkinghand.model.services.HearingImpairedServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "hearingImpaired")
public class HearingImpairedController {
    private HearingImpairedServices hearingImpairedServices  ;

    @Autowired
    public HearingImpairedController(HearingImpairedServices hearingImpairedServices) {
        this.hearingImpairedServices = hearingImpairedServices;
    }

    //@GetMapping("api/student")
    @GetMapping
    public List<HearingImpaired> getHearingImpaireds() {
        return hearingImpairedServices.getHearingImpaireds();
    }

    @GetMapping(path = "{hearingImpairedId}")
    public Optional<HearingImpaired> getHearingImpaired(@PathVariable(name = "hearingImpairedId") Integer hearingImpairedId) {
        return hearingImpairedServices.getHearingImpaired(hearingImpairedId);

    }

    //@PostMapping("/api/student/add")
    @PostMapping("add")
    public void  registerNewHearingImpaired(@RequestBody HearingImpaired hearingImpaired){
        hearingImpairedServices.addNewHearingImpaired(hearingImpaired);
    }
    @PutMapping(path="update/{id}")
    public void updateHearingImpaired(@RequestBody HearingImpaired hearingImpaired){
        hearingImpairedServices.addNewHearingImpaired(hearingImpaired);
    }
    // not work
    @DeleteMapping(path = "delete/{HearingImpairedId}")
    public void deleteHearingImpaired(@PathVariable ("hearingImpairedId") Integer hearingImpairedId){
        hearingImpairedServices.deleteHearingImpaired(hearingImpairedId);
    }

}



