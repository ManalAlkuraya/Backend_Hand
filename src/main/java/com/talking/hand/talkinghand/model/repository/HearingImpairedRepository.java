package com.talking.hand.talkinghand.model.repository;

import com.talking.hand.talkinghand.model.entities.HearingImpaired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface HearingImpairedRepository extends JpaRepository<HearingImpaired, Integer> {
                                                       // <name of the Entitie , data type of my PK>
//@Query("SELECT HearingImpaired.hearingimpairedID, HearingImpaired.age , Training.tday FROM HearingImpaired INNER JOIN Training ON HearingImpaired.hearingimpairedID = Training.trainingID")
//    Collection<HearingImpaired> findAllAc();
}
