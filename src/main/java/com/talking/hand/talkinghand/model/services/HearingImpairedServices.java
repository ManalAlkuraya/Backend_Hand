package com.talking.hand.talkinghand.model.services;

//
import com.talking.hand.talkinghand.model.entities.HearingImpaired;
import com.talking.hand.talkinghand.model.repository.HearingImpairedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HearingImpairedServices {
    private HearingImpairedRepository hearingImpairedRepository;
    @Autowired
    public HearingImpairedServices(HearingImpairedRepository hearingImpairedRepository) {
        this.hearingImpairedRepository = hearingImpairedRepository;
    }

    public List<HearingImpaired> getHearingImpaireds()
    {
        return hearingImpairedRepository.findAll();
    }

    public Optional<HearingImpaired> getHearingImpaired(Integer hearingImpairedId) {
        return hearingImpairedRepository.findById(hearingImpairedId);
    }


    public void addNewHearingImpaired(HearingImpaired hearingImpaired){
        hearingImpairedRepository.save(hearingImpaired);
    }

    public void deleteHearingImpaired(Integer hearingImpairedId) {
        hearingImpairedRepository.deleteById(hearingImpairedId);
        //boolean exist = studentRepository.existsById(studentId);
        // put a condition on 'exist'. if exist then delete
    }

}
